import SwiftUI

struct Ceels: View {
  var body: some View {
    VStack(
        alignment: .leading, 
        spacing: 32
    ) {
        Greeting()
        VStack(
          alignment: .leading, 
          spacing: 24
        ) {
            VStack(
              alignment: .leading, 
              spacing: 20
            ) {
              Appointment()
              Search()
            }
            Widgets()
        }
        Doctors_list()
      }
  }
}

#Preview {
  Ceels()
}
