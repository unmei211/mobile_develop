import SwiftUI

struct Search: View {
  var body: some View {
    HStack(
      alignment: .center, 
      spacing: 12
    ) {
      Image("search-normal")
      .frame(
        width: 24, 
        height: 24
      )
      Text("Search doctor or health issue")
        .font(Font.custom("Poppins", size: 15))
        .foregroundColor(Color("Color1"))
    }
    .padding(16)
    .frame(
      width: 327, 
      alignment: .leading
    )
    .background(Color("Color3"))
    .cornerRadius(12)
  }
}

#Preview {
  Search()
}
