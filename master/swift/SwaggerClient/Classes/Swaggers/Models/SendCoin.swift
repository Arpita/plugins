//
// SendCoin.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class SendCoin: JSONEncodable {
    public var satoshis: Int64?
    public var toAddr: String?
    public var msg: String?
    public var pin: String?
    public var fees: AnyObject?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["satoshis"] = self.satoshis?.encodeToJSON()
        nillableDictionary["toAddr"] = self.toAddr
        nillableDictionary["msg"] = self.msg
        nillableDictionary["pin"] = self.pin
        nillableDictionary["fees"] = self.fees
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
