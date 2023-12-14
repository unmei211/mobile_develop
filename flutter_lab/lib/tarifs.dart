import 'dart:js_interop';

import 'package:flutter/material.dart';
import 'package:flutter_mobile/constants/colors.dart';
import 'package:flutter_mobile/constants/paths.dart';
import 'package:flutter_mobile/constants/strings.dart';
import 'package:flutter_mobile/subscribtion.dart';
import 'package:flutter_mobile/tag.dart';
import 'package:flutter_mobile/tarifs.dart';

class Tarifs extends StatelessWidget {
  final String titleText;
  final String tarifInfo;
  final String imagePath;
  final TextStyle? head;
  final TextStyle? body;
  const Tarifs(
      {super.key,
      required this.titleText,
      required this.tarifInfo,
      required this.imagePath,
      required this.head,
      required this.body});

  @override
  Widget build(BuildContext context) {
    List<Widget> childrens = [];
    childrens.add(Text(titleText, style: head));
    if (tarifInfo != "") {
      childrens.add(Text(
        tarifInfo,
        style: body,
      ));
      childrens.add(Padding(
        padding: const EdgeInsets.only(top: 10.0),
        child: Container(
          height: 1.0,
          width: 235,
          color: CustomColors.grayFont,
        ),
      ));
    }

    return TextButton(
        onPressed: () {},
        child: Row(
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            Image.asset(imagePath),
            const Padding(padding: EdgeInsets.only(left: 10)),
            Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: childrens,
            ),
            const Expanded(child: SizedBox()),
            const Align(
                alignment: Alignment.centerRight,
                child: Icon(
                  Icons.keyboard_arrow_right,
                  color: Color.fromRGBO(0, 0, 0, 0.32),
                ))
          ],
        ));
  }
}
