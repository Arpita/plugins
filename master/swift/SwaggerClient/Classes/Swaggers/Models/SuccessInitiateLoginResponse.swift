//
// SuccessInitiateLoginResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class SuccessInitiateLoginResponse: JSONEncodable {
    public var info: String?
    public var validTill: Int64?
    public var mfa: String?
    public var token: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["info"] = self.info
        nillableDictionary["validTill"] = self.validTill?.encodeToJSON()
        nillableDictionary["mfa"] = self.mfa
        nillableDictionary["token"] = self.token
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
