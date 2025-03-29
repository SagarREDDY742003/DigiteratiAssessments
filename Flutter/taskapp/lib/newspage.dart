import 'dart:async';
import 'dart:convert';
import 'dart:io';
import 'package:flutter/material.dart';
import 'package:http/io_client.dart';

class NewsPage extends StatefulWidget {
  const NewsPage({super.key});
  @override
  State<NewsPage> createState() => _NewsPageState();
}

class _NewsPageState extends State<NewsPage> {
  String _category = 'Business';
  Timer? _timer;
  List<dynamic> _articles = [];

  final List<String> _categories = [
    'Business',
    'Entertainment',
    'Health',
    'Science',
    'Sports',
    'Technology',
  ];

  @override
  void initState() {
    super.initState();
    _fetchNews();
    _timer = Timer.periodic(Duration(seconds: 15), (Timer t) => _fetchNews());
  }

  Future<void> _fetchNews() async {
    final httpClient = HttpClient()
      ..badCertificateCallback = (X509Certificate cert, String host, int port) => true;
    final ioClient = IOClient(httpClient);

    final response = await ioClient.get(Uri.parse('https://newsapi.org/v2/top-headlines?country=us&category=$_category&apiKey=fc942ed9cfc0483fa0b1263782a214b3'));
    if (response.statusCode == 200) {
      final data = jsonDecode(response.body);
      setState(() {
        _articles = data['articles'];
      });
    } else {
      throw Exception('Failed to load news');
    }
  }

  @override
  void dispose() {
    _timer?.cancel();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('News Page'),
        backgroundColor: Colors.blue,
      ),
      body: Column(
        children: [
          DropdownButton<String>(
            value: _category,
            onChanged: (String? newValue) {
              setState(() {
                _category = newValue!;
                _fetchNews();
              });
            },
            items: _categories.map<DropdownMenuItem<String>>((String value) {
              return DropdownMenuItem<String>(
                value: value,
                child: Text(value),
              );
            }).toList(),
          ),
          Expanded(
            child: _articles.isEmpty
                ? Center(child: CircularProgressIndicator())
                : ListView.builder(
                    itemCount: _articles.length,
                    itemBuilder: (context, index) {
                      final article = _articles[index];
                      return Column(
                        children: [
                          Container(
                            margin: const EdgeInsets.all(16.0),
                            color: Colors.green[100],
                            child: ListTile(
                              title: Text(article['title'] ?? 'No title'),
                            ),
                          ),
                        ],
                      );
                    },
                  ),
          ),
        ],
      ),
    );
  }
}