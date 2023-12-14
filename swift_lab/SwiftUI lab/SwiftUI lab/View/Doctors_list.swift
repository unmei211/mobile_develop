import SwiftUI

struct Doctors_list: View {
  var body: some View {
    VStack(
      alignment: .leading, 
      spacing: 16
    ) {
        Text("Near Doctor")
          .font(
            Font.custom("Poppins", size: 16)
              .weight(.semibold)
          )
          .foregroundColor(Color("Color2"))
        FirstDoctor()
        SecondDoctor()
    }
    .frame(
      maxWidth: .infinity, 
      alignment: .topLeading
    )
  }
}

#Preview {
  Doctors_list()
}
