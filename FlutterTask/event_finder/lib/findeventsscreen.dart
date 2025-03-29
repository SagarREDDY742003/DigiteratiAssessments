import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import 'localization.dart';

class FindEventsPage extends StatefulWidget {
  @override
  _FindEventsPageState createState() => _FindEventsPageState();
}

class _FindEventsPageState extends State<FindEventsPage> {
  String? selectedLocation;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text(AppLocalizations.of(context).translate("find_event")),backgroundColor: Colors.blue,),
      backgroundColor: Colors.orange[100],
      body: Column(
        children: [
          StreamBuilder<QuerySnapshot>(
            stream: FirebaseFirestore.instance.collection('events').snapshots(),
            builder: (context, snapshot) {
              if (!snapshot.hasData) return CircularProgressIndicator();

              // Get unique locations
              Set<String> uniqueLocations = snapshot.data!.docs
                  .map((doc) => doc['location'].toString())
                  .toSet();

              return DropdownButton<String>(
                hint: Text(AppLocalizations.of(context).translate("select_location")),
                value: selectedLocation,
                onChanged: (newValue) {
                  setState(() {
                    selectedLocation = newValue;
                  });
                },
                items: uniqueLocations.map((location) {
                  return DropdownMenuItem(
                    value: location,
                    child: Text(location),
                  );
                }).toList(),
              );
            },
          ),
          Expanded(
            child: StreamBuilder<QuerySnapshot>(
              stream: selectedLocation == null
                  ? FirebaseFirestore.instance.collection('events').snapshots()
                  : FirebaseFirestore.instance
                      .collection('events')
                      .where('location', isEqualTo: selectedLocation)
                      .snapshots(),
              builder: (context, snapshot) {
                if (!snapshot.hasData) return CircularProgressIndicator();

                return ListView(
                  children: snapshot.data!.docs.map((doc) {
                    return Card(
                      margin: EdgeInsets.all(10),
                      child: ListTile(
                        title: Text(doc['name']),
                        subtitle: Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Text("Location: ${doc['location']}"),
                            Text("Date: ${doc['date']}"), // Display event date
                          ],
                        ),
                        leading: Image.network(
                          doc['imageUrl'],
                          width: 50,
                          height: 50,
                          fit: BoxFit.cover,
                        ),
                      ),
                    );
                  }).toList(),
                );
              },
            ),
          ),
        ],
      ),
    );
  }
}

