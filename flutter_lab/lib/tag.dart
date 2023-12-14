import 'package:flutter/material.dart';
import 'package:flutter_mobile/constants/colors.dart';

class Tag extends StatelessWidget {
  final String text;
  final TextStyle? tagStyle;
  const Tag({Key? key, required this.text, required this.tagStyle})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
        clipBehavior: Clip.antiAlias,
        decoration: ShapeDecoration(
          color: Colors.black.withOpacity(0.08),
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(16),
          ),
        ),
        padding: const EdgeInsets.all(7),
        child: Text(text, style: tagStyle));
  }
}
