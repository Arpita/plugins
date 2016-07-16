//
// MethodCountryMobile.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class MethodCountryMobile: JSONEncodable {
    public var method: String?
    public var countryCode: Int32?
    public var phoneNumber: Int64?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["method"] = self.method
        nillableDictionary["countryCode"] = self.countryCode?.encodeToJSON()
        nillableDictionary["phoneNumber"] = self.phoneNumber?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
