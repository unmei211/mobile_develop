import 'package:flutter/material.dart';
import 'package:flutter_mobile/constants/strings.dart';
import 'package:flutter_mobile/tag.dart';

class TagsWidget extends StatelessWidget {
  final List<Tag> list;
  final TextStyle? headStyle;
  final TextStyle? descStyle;

  const TagsWidget({
    super.key,
    required this.list,
    required this.headStyle,
    required this.descStyle,
  });

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        const Text(StringsInterestets.head,
            style: TextStyle(fontSize: 20, fontWeight: FontWeight.w700)),
        Text(
          StringsInterestets.headDesc,
          style: TextStyle(color: Colors.black.withOpacity(0.55)),
        ),
        const Padding(padding: EdgeInsets.only(top: 10)),
        Wrap(
          spacing: 8.0, // Отступ между элементами
          runSpacing: 8.0, // Отступ между строками
          children: list,
        ),
      ],
    );
  }
}
