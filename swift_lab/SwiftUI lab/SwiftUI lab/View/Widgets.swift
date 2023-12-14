import SwiftUI

struct Widgets: View {
  var body: some View {
    HStack(
      alignment: .center, 
      spacing: 13
    ) {
        VStack(
          alignment: .center, 
          spacing: 8
        ) {
            HStack(
              alignment: .top, 
              spacing: 10
            ) {
                Image("sun")
                  .frame(
                    width: 24, 
                    height: 24
                )
            }
            .padding(24)
            .background(Color("Color3"))
            .cornerRadius(100)
            Text("Covid 19")
              .font(Font.custom("Poppins", size: 15))
              .foregroundColor(Color("Color1"))
        }
        VStack(
          alignment: .center, 
          spacing: 8
        ) {
            HStack(
              alignment: .top, 
              spacing: 10
            ) {
                Image("profile-add")
                  .frame(
                    width: 24, 
                    height: 24
                  )
            }
            .padding(24)
            .background(Color("Color3"))
            .cornerRadius(100)
            Text("Doctor")
              .font(Font.custom("Poppins", size: 15))
              .foregroundColor(Color("Color1"))
        }
        VStack(
          alignment: .center, 
          spacing: 8
        ) {
            HStack(
              alignment: .top, 
              spacing: 10
            ) {
                Image("link")
                  .frame(width: 24, height: 24)
            }
            .padding(24)
            .background(Color("Color3"))
            .cornerRadius(100)
            Text("Medicine")
              .font(Font.custom("Poppins", size: 15))
              .foregroundColor(Color("Color1"))
        }
        VStack(
          alignment: .center, 
          spacing: 8
        ) {
            HStack(
              alignment: .top, 
              spacing: 10
            ) {
                Image("hospital")
                  .frame(width: 24, height: 24)
            }
            .padding(24)
            .background(Color("Color3"))
            .cornerRadius(100)
            Text("Hospital")
                .font(Font.custom("Poppins", size: 15))
                .foregroundColor(Color("Color1"))
        }
    }
  }
}

#Preview {
  Widgets()
}
