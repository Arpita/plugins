/* 
 * Coinsecure Api Documentation
 *
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: 1.0b
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
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;

namespace IO.Swagger.Model
{
    /// <summary>
    /// NewAddress
    /// </summary>
    [DataContract]
    public partial class NewAddress :  IEquatable<NewAddress>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NewAddress" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NewAddress() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="NewAddress" /> class.
        /// </summary>
        /// <param name="WalletID">WalletID (required).</param>
        /// <param name="Info">Info (required).</param>
        public NewAddress(string WalletID = null, string Info = null)
        {
            // to ensure "WalletID" is required (not null)
            if (WalletID == null)
            {
                throw new InvalidDataException("WalletID is a required property for NewAddress and cannot be null");
            }
            else
            {
                this.WalletID = WalletID;
            }
            // to ensure "Info" is required (not null)
            if (Info == null)
            {
                throw new InvalidDataException("Info is a required property for NewAddress and cannot be null");
            }
            else
            {
                this.Info = Info;
            }
        }
        
        /// <summary>
        /// Gets or Sets WalletID
        /// </summary>
        [DataMember(Name="walletID", EmitDefaultValue=false)]
        public string WalletID { get; set; }
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
            sb.Append("class NewAddress {\n");
            sb.Append("  WalletID: ").Append(WalletID).Append("\n");
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
            return this.Equals(obj as NewAddress);
        }

        /// <summary>
        /// Returns true if NewAddress instances are equal
        /// </summary>
        /// <param name="other">Instance of NewAddress to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NewAddress other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.WalletID == other.WalletID ||
                    this.WalletID != null &&
                    this.WalletID.Equals(other.WalletID)
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
                if (this.WalletID != null)
                    hash = hash * 59 + this.WalletID.GetHashCode();
                if (this.Info != null)
                    hash = hash * 59 + this.Info.GetHashCode();
                return hash;
            }
        }
    }

}
