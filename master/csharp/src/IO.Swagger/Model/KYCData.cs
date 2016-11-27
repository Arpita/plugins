/* 
 * Coinsecure Api Documentation
 *
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: beta
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// KYCData
    /// </summary>
    [DataContract]
    public partial class KYCData :  IEquatable<KYCData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KYCData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected KYCData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="KYCData" /> class.
        /// </summary>
        /// <param name="TimeDetails">TimeDetails (required).</param>
        /// <param name="KycID">KycID (required).</param>
        /// <param name="FirstName">FirstName (required).</param>
        /// <param name="LastName">LastName (required).</param>
        /// <param name="Status">Status (required).</param>
        /// <param name="UserType">UserType (required).</param>
        /// <param name="Info">Info (required).</param>
        public KYCData(TimeKYCData TimeDetails = null, string KycID = null, string FirstName = null, string LastName = null, string Status = null, string UserType = null, string Info = null)
        {
            // to ensure "TimeDetails" is required (not null)
            if (TimeDetails == null)
            {
                throw new InvalidDataException("TimeDetails is a required property for KYCData and cannot be null");
            }
            else
            {
                this.TimeDetails = TimeDetails;
            }
            // to ensure "KycID" is required (not null)
            if (KycID == null)
            {
                throw new InvalidDataException("KycID is a required property for KYCData and cannot be null");
            }
            else
            {
                this.KycID = KycID;
            }
            // to ensure "FirstName" is required (not null)
            if (FirstName == null)
            {
                throw new InvalidDataException("FirstName is a required property for KYCData and cannot be null");
            }
            else
            {
                this.FirstName = FirstName;
            }
            // to ensure "LastName" is required (not null)
            if (LastName == null)
            {
                throw new InvalidDataException("LastName is a required property for KYCData and cannot be null");
            }
            else
            {
                this.LastName = LastName;
            }
            // to ensure "Status" is required (not null)
            if (Status == null)
            {
                throw new InvalidDataException("Status is a required property for KYCData and cannot be null");
            }
            else
            {
                this.Status = Status;
            }
            // to ensure "UserType" is required (not null)
            if (UserType == null)
            {
                throw new InvalidDataException("UserType is a required property for KYCData and cannot be null");
            }
            else
            {
                this.UserType = UserType;
            }
            // to ensure "Info" is required (not null)
            if (Info == null)
            {
                throw new InvalidDataException("Info is a required property for KYCData and cannot be null");
            }
            else
            {
                this.Info = Info;
            }
        }
        
        /// <summary>
        /// Gets or Sets TimeDetails
        /// </summary>
        [DataMember(Name="timeDetails", EmitDefaultValue=false)]
        public TimeKYCData TimeDetails { get; set; }
        /// <summary>
        /// Gets or Sets KycID
        /// </summary>
        [DataMember(Name="kycID", EmitDefaultValue=false)]
        public string KycID { get; set; }
        /// <summary>
        /// Gets or Sets FirstName
        /// </summary>
        [DataMember(Name="firstName", EmitDefaultValue=false)]
        public string FirstName { get; set; }
        /// <summary>
        /// Gets or Sets LastName
        /// </summary>
        [DataMember(Name="lastName", EmitDefaultValue=false)]
        public string LastName { get; set; }
        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }
        /// <summary>
        /// Gets or Sets UserType
        /// </summary>
        [DataMember(Name="userType", EmitDefaultValue=false)]
        public string UserType { get; set; }
        /// <summary>
        /// Gets or Sets Info
        /// </summary>
        [DataMember(Name="info", EmitDefaultValue=false)]
        public string Info { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KYCData {\n");
            sb.Append("  TimeDetails: ").Append(TimeDetails).Append("\n");
            sb.Append("  KycID: ").Append(KycID).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  UserType: ").Append(UserType).Append("\n");
            sb.Append("  Info: ").Append(Info).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as KYCData);
        }

        /// <summary>
        /// Returns true if KYCData instances are equal
        /// </summary>
        /// <param name="other">Instance of KYCData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KYCData other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.TimeDetails == other.TimeDetails ||
                    this.TimeDetails != null &&
                    this.TimeDetails.Equals(other.TimeDetails)
                ) && 
                (
                    this.KycID == other.KycID ||
                    this.KycID != null &&
                    this.KycID.Equals(other.KycID)
                ) && 
                (
                    this.FirstName == other.FirstName ||
                    this.FirstName != null &&
                    this.FirstName.Equals(other.FirstName)
                ) && 
                (
                    this.LastName == other.LastName ||
                    this.LastName != null &&
                    this.LastName.Equals(other.LastName)
                ) && 
                (
                    this.Status == other.Status ||
                    this.Status != null &&
                    this.Status.Equals(other.Status)
                ) && 
                (
                    this.UserType == other.UserType ||
                    this.UserType != null &&
                    this.UserType.Equals(other.UserType)
                ) && 
                (
                    this.Info == other.Info ||
                    this.Info != null &&
                    this.Info.Equals(other.Info)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.TimeDetails != null)
                    hash = hash * 59 + this.TimeDetails.GetHashCode();
                if (this.KycID != null)
                    hash = hash * 59 + this.KycID.GetHashCode();
                if (this.FirstName != null)
                    hash = hash * 59 + this.FirstName.GetHashCode();
                if (this.LastName != null)
                    hash = hash * 59 + this.LastName.GetHashCode();
                if (this.Status != null)
                    hash = hash * 59 + this.Status.GetHashCode();
                if (this.UserType != null)
                    hash = hash * 59 + this.UserType.GetHashCode();
                if (this.Info != null)
                    hash = hash * 59 + this.Info.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
