//
// RateVolDataResponse.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


public class RateVolDataResponse: JSONEncodable {
    /** true */
    public var success: Bool?
    public var message: [RateVolData]?
    public var method: String?
    public var title: String?
    public var time: NSDate?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["success"] = self.success
        nillableDictionary["message"] = self.message?.encodeToJSON()
        nillableDictionary["method"] = self.method
        nillableDictionary["title"] = self.title
        nillableDictionary["time"] = self.time?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
