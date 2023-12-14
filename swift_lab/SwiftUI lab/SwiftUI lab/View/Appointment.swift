import SwiftUI

let photoD = "Group 1"
let nameD = "Dr. Imran Syahir"
let specialityD = "General Doctor"
let dateD = "Sunday, 12 June"
let timeD = "11:00 - 12:00 AM"

struct Appointment: View {
  var body: some View {
    VStack(
      alignment: .center, 
      spacing: 16
    ) {
        HStack(
          alignment: .center
        ) {
            HStack(
              alignment: .center, 
              spacing: 12
            ) {
                Image("\(photoD)")
                .frame(
                  width: 48, 
                  height: 48
                )
                VStack(
                  alignment: .leading, 
                  spacing: 8
                ) {
                    Text("\(nameD)")
                      .font(
                        Font.custom(
                          "Poppins", 
                          size: 16
                        )
                        .weight(.bold)
                      )
                      .foregroundColor(.white)
                    Text("\(specialityD)")
                      .font(Font.custom("Poppins", size: 14))
                      .foregroundColor(Color("Color9"))
                  }
              }
            Spacer()
            Image("arrow-right")
            .frame(
              width: 24, 
              height: 24
            )
          }
        .frame(
          maxWidth: .infinity,
          alignment: .center
        )
        Image("Vector 1")
        .frame(
          maxWidth: .infinity,
          minHeight: 0, 
          maxHeight: 0
        )
        .overlay(
          Rectangle()
            .stroke(
              .white.opacity(0.15), 
              lineWidth: 1
            )
        )
        HStack(
          alignment: .top, 
          spacing: 12
        ) {
            HStack(
              alignment: .center, 
              spacing: 8
            ) {
                Image("calendar-2")
                .frame(width: 16, height: 16)
                Text("\(dateD)")
                  .font(Font.custom("Poppins", size: 12))
                  .foregroundColor(.white)
            }
            .frame(
              maxWidth: .infinity, 
              alignment: .leading
            )
            HStack(
              alignment: .center, 
              spacing: 8
            ) {
                Image("clock")
                .frame(
                  width: 16, 
                  height: 16
                )
                Text("\(timeD)")
                  .font(Font.custom("Poppins", size: 12))
                  .foregroundColor(.white)
            }
            .frame(
              maxWidth: .infinity, 
              alignment: .leading
            )
          }
        .frame(
          maxWidth: .infinity, 
          alignment: .topLeading
        )
      }
    .padding(20)
    .frame(
      width: 327, 
      alignment: .top
    )
    .background(Color("Color6"))
    .cornerRadius(12)
  }
}

#Preview {
  Appointment()
}
