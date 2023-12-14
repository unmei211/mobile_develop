import 'package:flutter/material.dart';
import 'package:flutter_mobile/constants/colors.dart';
import 'package:flutter_mobile/constants/paths.dart';
import 'package:flutter_mobile/constants/strings.dart';
import 'package:flutter_mobile/limits.dart';
import 'package:flutter_mobile/subscribtion.dart';
import 'package:flutter_mobile/tag.dart';
import 'package:flutter_mobile/tags.dart';
import 'package:flutter_mobile/tarifs.dart';

List<Tag> getList(TextStyle? tagStyle) {
  List<Tag> list = [];
  for (var tag in StringsInterestets.listOfTags) {
    list.add(Tag(
      text: tag,
      tagStyle: tagStyle,
    ));
  }

  return list;
}

class BodyWidget extends StatelessWidget {
  const BodyWidget({super.key});

  static const TextTheme bodyTextTheme = TextTheme(
    displayLarge: TextStyle(
        fontFamily: 'SF Pro Text',
        fontSize: 20,
        fontWeight: FontWeight.w700,
        color: CustomColors.blackFont),
    bodyLarge: TextStyle(
        fontFamily: 'SF Pro Text',
        fontSize: 14,
        fontWeight: FontWeight.w500,
        color: CustomColors.grayFont),
    bodyMedium: TextStyle(
      color: CustomColors.blackFont,
      fontSize: 16,
      fontFamily: 'SF Pro Text',
      fontWeight: FontWeight.w500,
    ),
    bodySmall: TextStyle(
      color: CustomColors.blackFont,
      fontSize: 14,
      fontFamily: 'SF Pro Text',
      fontWeight: FontWeight.w500,
    ),
  );

  @override
  Widget build(BuildContext context) {
    return Container(
      color: CustomColors.body,
      child: ListView(
        padding: const EdgeInsets.only(top: 20, left: 20, right: 20),
        children: [
          Text(Strings.subscribtionHead, style: bodyTextTheme.displayLarge),
          Text(
            Strings.subscribtionInfo,
            style: bodyTextTheme.bodyLarge,
          ),
          const Padding(padding: EdgeInsets.only(top: 20)),
          SizedBox(
            height: 130,
            child: ListView(scrollDirection: Axis.horizontal, children: [
              Subscribtion(
                titleText: Strings.subscribtionSber,
                paymentText: Strings.subscribtionSberPayDate,
                priceText: Strings.subscribtionSberPrice,
                imagePath: Paths.sberIcon,
                headStyle: bodyTextTheme.bodyMedium,
                infoStyle: bodyTextTheme.bodySmall,
                priceStyle: bodyTextTheme.bodyLarge,
              ),
              const Padding(padding: EdgeInsets.only(left: 10)),
              Subscribtion(
                titleText: Strings.subscribtionTransfer,
                paymentText: Strings.subscribtionAutoPayDate,
                priceText: Strings.subscribtionSberPrice,
                imagePath: Paths.percentIcon,
                headStyle: bodyTextTheme.bodyMedium,
                infoStyle: bodyTextTheme.bodySmall,
                priceStyle: bodyTextTheme.bodyLarge,
              ),
            ]),
          ),
          const Padding(padding: EdgeInsets.only(top: 40)),
          LimitsWidget(
              head: bodyTextTheme.displayLarge,
              headDesc: bodyTextTheme.bodyLarge,
              bodyHead: bodyTextTheme.bodyMedium),
          const Padding(padding: EdgeInsets.only(top: 40)),
          TagsWidget(
            list: getList(bodyTextTheme.bodyLarge),
            headStyle: bodyTextTheme.displayLarge,
            descStyle: bodyTextTheme.bodyLarge,
          ),
          const Padding(padding: EdgeInsets.only(top: 20))
        ],
      ),
    );
  }
}
