//
// FiatBankData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class FiatBankData: JSONEncodable {
    public var time: Int64?
    public var status: String?
    public var updateTime: Int64?
    public var updateMessage: String?
    public var bankID: String?
    public var info: String?
    public var accountNumber: String?
    public var accountNick: String?
    public var accountType: String?
    public var accountID: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["time"] = self.time?.encodeToJSON()
        nillableDictionary["status"] = self.status
        nillableDictionary["updateTime"] = self.updateTime?.encodeToJSON()
        nillableDictionary["updateMessage"] = self.updateMessage
        nillableDictionary["bankID"] = self.bankID
        nillableDictionary["info"] = self.info
        nillableDictionary["accountNumber"] = self.accountNumber
        nillableDictionary["accountNick"] = self.accountNick
        nillableDictionary["accountType"] = self.accountType
        nillableDictionary["accountID"] = self.accountID
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
