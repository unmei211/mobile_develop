import SwiftUI

struct Bottom_panel: View {
  var body: some View {
    HStack(
      alignment: .center, 
      spacing: 12
    ) {
      HStack(
        alignment: .center, 
        spacing: 8
      ) {
          Image("Home")
          .frame(
            width: 24,
            height: 24
          )
          Text("Home")
            .font(
              Font.custom("Nunito", size: 14)
              .weight(.bold)
            )
            .frame(
              width: 39, 
              height: 19
          )
          .foregroundColor(Color("Color8"))
      }
      .padding(12)
      .background(Color("Color8").opacity(0.1))
      .cornerRadius(12)
      HStack(
        alignment: .center, 
        spacing: 8
      ) {
          HStack(
            alignment: .center, 
            spacing: 0
          ) {
              Image("calendar-2 1")
              .frame(
                width: 24, 
                height: 24
              )
          }
          .frame(
            width: 24, 
            height: 24, 
            alignment: .center
          )
      }
      .padding(12)
      .frame(
        maxWidth: .infinity, 
        alignment: .center
      )
      HStack(
        alignment: .center, 
        spacing: 8
      ) {
          HStack(
            alignment: .center, 
            spacing: 0
          ) {
              Image("message")
              .frame(
                width: 24, 
                height: 24
              )
          }
          .frame(
            width: 24, 
            height: 24, 
            alignment: .center
          )
      }
      .padding(12)
      .frame(
        maxWidth: .infinity, 
        alignment: .center
      )
      HStack(
        alignment: .center, 
        spacing: 8
      ) {
          HStack(
            alignment: .center, 
            spacing: 0
          ) {
              Image("profile")
              .frame(
                width: 24, 
                height: 24
              )
          }
          .frame(
            width: 24, 
            height: 24, 
            alignment: .center
          )
      }
      .padding(12)
      .frame(
        maxWidth: .infinity, 
        alignment: .center
      )
    }
    .padding(.horizontal, 24)
    .padding(.vertical, 16)
    .frame(
      width: 375, 
      alignment: .center
    )
    .background(.white)
  }
}

#Preview {
  Bottom_panel()
}
