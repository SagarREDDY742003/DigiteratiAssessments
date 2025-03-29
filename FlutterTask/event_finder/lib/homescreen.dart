import 'package:flutter/material.dart';
import 'localization.dart';
import 'createeventscreen.dart';
import 'findeventsscreen.dart';

class HomePage extends StatelessWidget {
  final Function(Locale) onLanguageChanged;

  HomePage({required this.onLanguageChanged});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.purple[50]   ,
      appBar: AppBar(
        title: Text(AppLocalizations.of(context).translate('title'), style: TextStyle(color: Colors.white) ),
        backgroundColor: Colors.blue,
        actions: [
          PopupMenuButton<String>(
            onSelected: (value) {
              if (value == 'English') {
                onLanguageChanged(Locale('en'));
              } else if (value == 'Español') {
                onLanguageChanged(Locale('es'));
              }
            },
            itemBuilder: (BuildContext context) => [
              PopupMenuItem(value: 'English', child: Text('English')),
              PopupMenuItem(value: 'Español', child: Text('Español')),
            ],
            icon: Icon(Icons.language),
          ),
        ],
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            ElevatedButton(
              onPressed: () {
                Navigator.push(context, MaterialPageRoute(
                  builder: (context) => CreateEventPage(),
                ));
              },
               style: ElevatedButton.styleFrom(
                  backgroundColor: Colors.teal, // Set background color
                  foregroundColor: Colors.white, // Set text color
                  padding: EdgeInsets.symmetric(horizontal: 20, vertical: 15), // Padding
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(10), // Rounded corners
                  ),
                ),
              child: Text(AppLocalizations.of(context).translate("create_event")),
            ),
            SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {
                Navigator.push(context, MaterialPageRoute(
                  builder: (context) => FindEventsPage(),
                ));
              },
              style: ElevatedButton.styleFrom(
                  backgroundColor: Colors.purple[500], // Set background color
                  foregroundColor: Colors.white, // Set text color
                  padding: EdgeInsets.symmetric(horizontal: 20, vertical: 15), // Padding
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(10), // Rounded corners
                  ),
              ),
              child: Text(AppLocalizations.of(context).translate("find_event")),
            ),
          ],
        ),
      ),
    );
  }
}



