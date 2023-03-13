import Foundation
import SwiftUI

import shared

public struct InvestingContentView: View {
    //problem here is that kmm for ios just expose one framework file, which include all modules of kmm see
    //https://akjaw.com/modularizing-a-kotlin-multiplatform-mobile-project/
    let greet = DomainInvesting().greet()
    
    public init() {}
    
    public var body: some View {
        Text(greet)
    }
}
