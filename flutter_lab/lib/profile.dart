import 'package:flutter/material.dart';
import 'package:flutter_mobile/tag.dart';
import 'package:flutter_mobile/tarifs.dart';
import 'package:flutter_mobile/subscribtion.dart';
import 'package:flutter_mobile/constants/colors.dart';
import 'package:flutter_mobile/constants/paths.dart';
import 'package:flutter_mobile/constants/strings.dart';
import 'package:flutter_mobile/body.dart';

class Profile extends StatefulWidget {
  const Profile({super.key});

  @override
  State<Profile> createState() => _ProfileState();
}

class _ProfileState extends State<Profile> with SingleTickerProviderStateMixin {
  late TabController _tabController;

  @override
  void initState() {
    super.initState();
    _tabController = TabController(length: 2, vsync: this);
  }

  @override
  void dispose() {
    _tabController.dispose();
    super.dispose();
  }

  static const TextTheme headTextTheme = TextTheme(
    displayLarge: TextStyle(
      fontFamily: 'SF Pro Text',
      fontSize: 24,
      fontWeight: FontWeight.w700,
      color: Colors.black
    ),
    bodyLarge: TextStyle(
      fontFamily: 'SF Pro Text',
      fontSize: 16,
      fontWeight: FontWeight.w500,
    ),
  );

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          backgroundColor: CustomColors.backgroundColor,
          toolbarHeight: 300,
          elevation: 0,
          iconTheme: const IconThemeData(color: CustomColors.accent),
          actions: const [
            Padding(
              padding: EdgeInsets.only(bottom: 170, right: 20),
              child: Icon(
                Icons.logout,
              ),
            ),
          ],
          title: Column(
            children: [
              Padding(
                padding: const EdgeInsets.only(bottom: 50),
                child: Center(
                  child: Image.asset(
                    Paths.profilePath,
                    fit: BoxFit.contain,
                    width: 110,
                  ),
                ),
              ),
              Text(Strings.name,
                  style: headTextTheme.displayLarge
                  ),
            ],
          ),
          bottom: TabBar(
            controller: _tabController,
            indicatorSize: TabBarIndicatorSize.tab,
            labelColor: Colors.black,
            tabs: [
              Tab(child: Text(Strings.tabFirst, style: headTextTheme.bodyLarge)),
              Tab(child: Text(Strings.tabSecond, style: headTextTheme.bodyLarge)),
            ],
            indicatorColor: CustomColors.accent,
          ),
          leading: const Padding(
            padding: EdgeInsets.only(bottom: 170, left: 20),
            child: Icon(
              Icons.close,
            ),
          ),
        ),
          body: const BodyWidget()
        );
  }
}
