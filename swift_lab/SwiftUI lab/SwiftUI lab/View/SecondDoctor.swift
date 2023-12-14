import SwiftUI

let photo_ = "Group 1-3"
let name_ = "Dr. Imran Syahir"
let speciality_ = "General Doctor"
let distance_ = "1.2 KM"
let review_ = "4.8 (120 Reviews)"
let open_at_ = "Open at 17.00"

struct SecondDoctor: View {
  var body: some View {
    VStack(
      alignment: .leading, 
      spacing: 12
    ) {
        VStack(
          alignment: .center, 
          spacing: 20
        ) {
            HStack(
              alignment: .center
            ) {
                HStack(
                  alignment: .top, 
                  spacing: 10
                ) {
                    Image("\(photo_)")
                      .frame(
                        width: 48, 
                        height: 48
                      )
                      .background(Color("Color3"))
                    VStack(
                      alignment: .leading, 
                      spacing: 10
                    ) {
                        VStack(
                          alignment: .leading, 
                          spacing: 8
                        ) {
                            Text("\(name_)")
                              .font(
                                Font.custom("Poppins", size: 16)
                                  .weight(.bold)
                              )
                              .foregroundColor(Color("Color2"))
                            Text("\(speciality_)")
                              .font(Font.custom("Poppins", size: 14))
                              .foregroundColor(Color("Color1"))
                        }
                    }
                }
                Spacer()
                HStack(
                  alignment: .center, 
                  spacing: 8
                ) {
                    Image("location")
                      .frame(
                        width: 16, 
                        height: 16
                      )
                    Text("\(distance_)")
                      .font(Font.custom("Poppins", size: 14))
                      .foregroundColor(Color("Color1"))
                  }
                }
                .frame(
                  width: 295, 
                  alignment: .center
                )
            }
            Image("Vector 1")
              .frame(
                maxWidth: .infinity, 
                minHeight: 0, 
                maxHeight: 0
              )
              .overlay(
                Rectangle()
                  .stroke(Color("Color4"), lineWidth: 1)
              )
            HStack(
              alignment: .top, 
              spacing: 12
            ) {
                HStack(
                  alignment: .center, 
                  spacing: 6
                ) {
                    Image("clock 1")
                      .frame(
                        width: 20, 
                        height: 20
                      )
                    Text("\(review_)")
                      .font(Font.custom("Poppins", size: 12))
                      .foregroundColor(Color("Color5"))
                }
                .frame(
                  maxWidth: .infinity, 
                  alignment: .leading
                )
                HStack(
                  alignment: .center, 
                  spacing: 6
                ) {
                    Image("clock 2")
                      .frame(
                        width: 20, 
                        height: 20
                      )
                    Text("\(open_at_)")
                      .font(Font.custom("Poppins", size: 12))
                      .foregroundColor(Color("Color6"))
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
        .padding(.horizontal, 16)
        .padding(.vertical, 20)
        .background(.white)
        .cornerRadius(12)
        .shadow(color: Color("Color7"), radius: 10, x: 2, y: 12)
  }
}

#Preview{
    SecondDoctor()
}
