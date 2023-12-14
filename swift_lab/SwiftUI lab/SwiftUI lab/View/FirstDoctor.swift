import SwiftUI

let photo = "Group 1-2"
let name = "Dr. Joseph Brostito"
let speciality = "Dental Specialist"
let distance = "1.2 KM"
let review = "4.8 (120 Reviews)"
let open_at = "Open at 17.00"

struct FirstDoctor: View {
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
                      Image("\(photo)")
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
                              Text("\(name)")
                                  .font(
                                    Font.custom("Poppins", size: 16)
                                      .weight(.bold)
                                  )
                                  .foregroundColor(Color("Color2"))
                              Text("\(speciality)")
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
                        Text("\(distance)")
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
                .stroke(
                  Color("Color4"), 
                  lineWidth: 1
                )
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
                      Text("\(review)")
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
                      Text("\(open_at)")
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
  FirstDoctor()
}
