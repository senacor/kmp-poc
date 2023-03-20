import Foundation
import SwiftUI

import shared

public struct GiroContentView: View {
    //problem here is that kmm for ios just expose one framework file, which include all modules of kmm see
    //https://akjaw.com/modularizing-a-kotlin-multiplatform-mobile-project/
    let greet = LogicGiro().greet()
    
    public init() {}
    
    public var body: some View {
        Text(greet)
    }
}
