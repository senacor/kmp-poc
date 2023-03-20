import SwiftUI
import shared
import UIBanking
import UIInvesting

struct ContentView: View {
    
    var body: some View {
        VStack(alignment: .center, spacing: 20) {
            ZahlungsverkehrContentView()
            GiroContentView()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
