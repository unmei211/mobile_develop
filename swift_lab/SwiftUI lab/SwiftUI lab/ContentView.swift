import SwiftUI

struct ContentView: View {
  var body: some View{
    List {
      ZStack(
        alignment: .center
      ) {
        Ceels()
      }
      Bottom_panel()
    }
    .frame(
      width: 375, 
      height: 812
    )
    .background(.white)
  }
}

#Preview {
  ContentView()
}
