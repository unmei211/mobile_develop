import 'package:flutter/material.dart';
import 'package:flutter_mobile/constants/colors.dart';
import 'package:flutter_mobile/constants/paths.dart';
import 'package:flutter_mobile/constants/strings.dart';
import 'package:flutter_mobile/subscribtion.dart';
import 'package:flutter_mobile/tag.dart';
import 'package:flutter_mobile/tarifs.dart';

class LimitsWidget extends StatelessWidget {
  const LimitsWidget(
      {super.key,
      required this.head,
      required this.headDesc,
      required this.bodyHead});
  final TextStyle? head;
  final TextStyle? headDesc;
  final TextStyle? bodyHead;
  @override
  Widget build(BuildContext context) {
    return Column(crossAxisAlignment: CrossAxisAlignment.start, children: [
      Text(
        StringsLimits.head,
        style: head,
      ),
      Text(
        StringsLimits.headDesc,
        style: headDesc,
      ),
      const Padding(padding: EdgeInsets.only(top: 20)),
      Tarifs(
        titleText: StringsLimits.firstPartHead,
        tarifInfo: StringsLimits.firstPartDesc,
        imagePath: Paths.scaleIcon,
        head: bodyHead,
        body: headDesc,
      ),
      const Padding(padding: EdgeInsets.only(top: 20)),
      Tarifs(
          titleText: StringsLimits.secondPartHead,
          tarifInfo: StringsLimits.secondPartDesc,
          imagePath: Paths.limitPercent,
          head: bodyHead,
          body: headDesc),
      const Padding(padding: EdgeInsets.only(top: 20)),
      Tarifs(
          titleText: StringsLimits.thirdPartHead,
          tarifInfo: "",
          imagePath: Paths.arrows,
          head: bodyHead,
          body: headDesc),
    ]);
  }
}
