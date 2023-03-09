import SwiftUI
import shared

struct ContentView: View {
//problem here is that kmm for ios just expose one framework file, which include all modules of kmm see
//https://akjaw.com/modularizing-a-kotlin-multiplatform-mobile-project/
	let greet = DomainBanking().greet() + " - " + DomainInvesting().greet()



	var body: some View {
		Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}