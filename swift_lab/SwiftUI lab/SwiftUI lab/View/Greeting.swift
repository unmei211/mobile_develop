import SwiftUI

let name_Client = "Hi James"

struct Greeting: View {
  var body: some View {
    HStack (
      alignment: .center
    ) {
        VStack(
          alignment: .leading, 
          spacing: 6
        ) {
            Text("Hello,")
              .font(
                .custom("Poppins", size: 16)
              )
              .foregroundColor(
                Color("Color1")
              )
            Text("\(name_Client)")
              .font(
                .custom("Poppins", size: 20)
                .weight(.bold)
              )
              .foregroundColor(
                Color("Color2")
              )
          }
        Spacer()
        Image("Frame")
          .frame(
            width: 56, 
            height: 56
          )
    }
    .frame(
      width: 327, 
      alignment: .center
    )
  }
}

#Preview {
  Greeting()
}
