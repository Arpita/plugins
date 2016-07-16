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
    /// TradeAddressData
    /// </summary>
    [DataContract]
    public partial class TradeAddressData :  IEquatable<TradeAddressData>
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TradeAddressData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TradeAddressData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TradeAddressData" /> class.
        /// </summary>
        /// <param name="Address">Address (required).</param>
        /// <param name="Time">Time (required).</param>
        /// <param name="Info">Info (required).</param>
        /// <param name="Netki">Netki (required).</param>
        public TradeAddressData(string Address = null, long? Time = null, string Info = null, string Netki = null)
        {
            // to ensure "Address" is required (not null)
            if (Address == null)
            {
                throw new InvalidDataException("Address is a required property for TradeAddressData and cannot be null");
            }
            else
            {
                this.Address = Address;
            }
            // to ensure "Time" is required (not null)
            if (Time == null)
            {
                throw new InvalidDataException("Time is a required property for TradeAddressData and cannot be null");
            }
            else
            {
                this.Time = Time;
            }
            // to ensure "Info" is required (not null)
            if (Info == null)
            {
                throw new InvalidDataException("Info is a required property for TradeAddressData and cannot be null");
            }
            else
            {
                this.Info = Info;
            }
            // to ensure "Netki" is required (not null)
            if (Netki == null)
            {
                throw new InvalidDataException("Netki is a required property for TradeAddressData and cannot be null");
            }
            else
            {
                this.Netki = Netki;
            }
        }
        
        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name="address", EmitDefaultValue=false)]
        public string Address { get; set; }
        /// <summary>
        /// Gets or Sets Time
        /// </summary>
        [DataMember(Name="time", EmitDefaultValue=false)]
        public long? Time { get; set; }
        /// <summary>
        /// Gets or Sets Info
        /// </summary>
        [DataMember(Name="info", EmitDefaultValue=false)]
        public string Info { get; set; }
        /// <summary>
        /// Gets or Sets Netki
        /// </summary>
        [DataMember(Name="netki", EmitDefaultValue=false)]
        public string Netki { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TradeAddressData {\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  Info: ").Append(Info).Append("\n");
            sb.Append("  Netki: ").Append(Netki).Append("\n");
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
            return this.Equals(obj as TradeAddressData);
        }

        /// <summary>
        /// Returns true if TradeAddressData instances are equal
        /// </summary>
        /// <param name="other">Instance of TradeAddressData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TradeAddressData other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Address == other.Address ||
                    this.Address != null &&
                    this.Address.Equals(other.Address)
                ) && 
                (
                    this.Time == other.Time ||
                    this.Time != null &&
                    this.Time.Equals(other.Time)
                ) && 
                (
                    this.Info == other.Info ||
                    this.Info != null &&
                    this.Info.Equals(other.Info)
                ) && 
                (
                    this.Netki == other.Netki ||
                    this.Netki != null &&
                    this.Netki.Equals(other.Netki)
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
                if (this.Address != null)
                    hash = hash * 59 + this.Address.GetHashCode();
                if (this.Time != null)
                    hash = hash * 59 + this.Time.GetHashCode();
                if (this.Info != null)
                    hash = hash * 59 + this.Info.GetHashCode();
                if (this.Netki != null)
                    hash = hash * 59 + this.Netki.GetHashCode();
                return hash;
            }
        }
    }

}
