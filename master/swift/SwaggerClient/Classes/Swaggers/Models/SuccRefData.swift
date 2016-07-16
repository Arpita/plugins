//
// SuccRefData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class SuccRefData: JSONEncodable {
    public var refPercent: Double?
    public var time: Int64?
    public var refID: String?
    public var emailVerified: Bool?
    public var kycComplete: Bool?
    public var btcEarned: Int64?
    public var fiatEarned: Int64?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["refPercent"] = self.refPercent
        nillableDictionary["time"] = self.time?.encodeToJSON()
        nillableDictionary["refID"] = self.refID
        nillableDictionary["emailVerified"] = self.emailVerified
        nillableDictionary["kycComplete"] = self.kycComplete
        nillableDictionary["btcEarned"] = self.btcEarned?.encodeToJSON()
        nillableDictionary["fiatEarned"] = self.fiatEarned?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
