import 'package:flutter/material.dart';
import 'package:intl/intl.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'localization.dart';

class CreateEventPage extends StatefulWidget {
  @override
  _CreateEventPageState createState() => _CreateEventPageState();
}

class _CreateEventPageState extends State<CreateEventPage> {
  final TextEditingController _eventNameController = TextEditingController();
  final TextEditingController _eventLocationController = TextEditingController();
  final TextEditingController _imageUrlController = TextEditingController();
  DateTime? _selectedDate; // Store the selected date

  // Function to show date picker
  Future<void> _pickDate(BuildContext context) async {
    DateTime? pickedDate = await showDatePicker(
      context: context,
      initialDate: DateTime.now(),
      firstDate: DateTime(2000),
      lastDate: DateTime(2100),
    );

    if (pickedDate != null) {
      setState(() {
        _selectedDate = pickedDate;
      });
    }
  }

  // Function to save event to Firebase
  void _saveEvent() {
    if (_eventNameController.text.isEmpty ||
        _eventLocationController.text.isEmpty ||
        _imageUrlController.text.isEmpty ||
        _selectedDate == null) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text("Please fill all fields")),
      );
      return;
    }

    FirebaseFirestore.instance.collection('events').add({
      'name': _eventNameController.text,
      'location': _eventLocationController.text,
      'date': DateFormat('yyyy-MM-dd').format(_selectedDate!), // Format date
      'imageUrl': _imageUrlController.text,
    }).then((value) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text("Event Created Successfully!")),
      );
      Navigator.pop(context); // Go back to home
    }).catchError((error) {
      print("Error saving event: $error");
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text(AppLocalizations.of(context).translate("create_event")),backgroundColor: Colors.blue,),
      body: Padding(
        padding: EdgeInsets.all(16.0),
        child: Column(
          children: [
            TextField(
              controller: _eventNameController,
              decoration: InputDecoration(labelText: AppLocalizations.of(context).translate("event_name")),
            ),
            TextField(
              controller: _eventLocationController,
              decoration: InputDecoration(labelText: AppLocalizations.of(context).translate("event_location")),
            ),
            TextField(
              controller: _imageUrlController,
              decoration: InputDecoration(labelText: AppLocalizations.of(context).translate("event_image")),
            ),
            SizedBox(height: 20),
            
            // Date Picker Button
            Row(
              children: [
                Expanded(
                  child: Text(
                    _selectedDate == null
                        ? "No Date Selected"
                        : "Date: ${DateFormat('yyyy-MM-dd').format(_selectedDate!)}",
                  ),
                ),
                ElevatedButton(
                  onPressed: () => _pickDate(context),
                  style: ElevatedButton.styleFrom(
                    backgroundColor: Colors.yellow[600], // Set background color
                    foregroundColor: Colors.brown, // Set text color
                    padding: EdgeInsets.symmetric(horizontal: 20, vertical: 15), // Padding
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(10), // Rounded corners
                    ),
                  ),
                  child: Text("Pick Date"),
                ),
              ],
            ),

            SizedBox(height: 20),
            ElevatedButton(
              onPressed: _saveEvent,
              style: ElevatedButton.styleFrom(
                backgroundColor: Colors.teal, // Set background color
                foregroundColor: Colors.white, // Set text color
                padding: EdgeInsets.symmetric(horizontal: 20, vertical: 15), // Padding
                shape: RoundedRectangleBorder(
                  borderRadius: BorderRadius.circular(10), // Rounded corners
                ),
              ),
              child: Text(AppLocalizations.of(context).translate("submit")),
            ),
          ],
        ),
      ),
    );
  }
}





