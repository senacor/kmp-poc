import Foundation
import SwiftUI

import shared

public struct BankingContentView: View {
    //problem here is that kmm for ios just expose one framework file, which include all modules of kmm see
    //https://akjaw.com/modularizing-a-kotlin-multiplatform-mobile-project/
      let greet = DomainBanking().greet()
    
    public init() {}
    
    public var body: some View {
        Text(greet)
    }
}
