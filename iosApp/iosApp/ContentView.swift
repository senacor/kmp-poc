import SwiftUI
import shared
import UIBanking
import UIInvesting

struct ContentView: View {
    //problem here is that kmm for ios just expose one framework file, which include all modules of kmm see
    //https://akjaw.com/modularizing-a-kotlin-multiplatform-mobile-project/
    let domainGreet = DomainBanking().greet()
    let investingGreet = DomainInvesting().greet()
    
    var body: some View {
        VStack(alignment: .center, spacing: 20) {
            Text(domainGreet)
            Text(investingGreet)
            BankingContentView()
            InvestingContentView()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
