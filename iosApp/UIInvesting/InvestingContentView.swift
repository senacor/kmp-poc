import Foundation
import SwiftUI

import shared

public struct InvestingContentView: View {
    //problem here is that kmm for ios just expose one framework file, which include all modules of kmm see
    //https://akjaw.com/modularizing-a-kotlin-multiplatform-mobile-project/

   @ObservedObject private(set) var viewModel: ViewModel

    public init() {}
    
    public var body: some View {
        Text(greet)
    }
}

extension InvestingContentView {
    class ViewModel: ObservableObject {
        @Published var text = "Loading..."
        init() {
            DomainInvesting().greet() { greeting, error in
                DispatchQueue.main.async {
                    if let greeting = greeting {
                        self.text = greeting
                    } else {
                        self.text = error?.localizedDescription ?? "error"
                    }
                }
            }
        }
    }
}
