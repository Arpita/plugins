//
// CoinDepData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class CoinDepData: JSONEncodable {
    public var timeDetails: TimeDataCoin?
    public var address: String?
    public var value: Int64?
    public var txHash: String?
    public var depositID: String?
    public var reason: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["timeDetails"] = self.timeDetails?.encodeToJSON()
        nillableDictionary["address"] = self.address
        nillableDictionary["value"] = self.value?.encodeToJSON()
        nillableDictionary["txHash"] = self.txHash
        nillableDictionary["depositID"] = self.depositID
        nillableDictionary["reason"] = self.reason
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
