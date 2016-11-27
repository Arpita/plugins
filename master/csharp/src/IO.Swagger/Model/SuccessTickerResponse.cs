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
    /// SuccessTickerResponse
    /// </summary>
    [DataContract]
    public partial class SuccessTickerResponse :  IEquatable<SuccessTickerResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SuccessTickerResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SuccessTickerResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SuccessTickerResponse" /> class.
        /// </summary>
        /// <param name="LastPrice">LastPrice (required).</param>
        /// <param name="Timestamp">Timestamp (required).</param>
        /// <param name="Bid">Bid (required).</param>
        /// <param name="Ask">Ask (required).</param>
        /// <param name="FiatVolume">FiatVolume (required).</param>
        /// <param name="CoinVolume">CoinVolume (required).</param>
        /// <param name="Open">Open (required).</param>
        /// <param name="High">High (required).</param>
        /// <param name="Low">Low (required).</param>
        public SuccessTickerResponse(long? LastPrice = null, long? Timestamp = null, long? Bid = null, long? Ask = null, long? FiatVolume = null, long? CoinVolume = null, long? Open = null, long? High = null, long? Low = null)
        {
            // to ensure "LastPrice" is required (not null)
            if (LastPrice == null)
            {
                throw new InvalidDataException("LastPrice is a required property for SuccessTickerResponse and cannot be null");
            }
            else
            {
                this.LastPrice = LastPrice;
            }
            // to ensure "Timestamp" is required (not null)
            if (Timestamp == null)
            {
                throw new InvalidDataException("Timestamp is a required property for SuccessTickerResponse and cannot be null");
            }
            else
            {
                this.Timestamp = Timestamp;
            }
            // to ensure "Bid" is required (not null)
            if (Bid == null)
            {
                throw new InvalidDataException("Bid is a required property for SuccessTickerResponse and cannot be null");
            }
            else
            {
                this.Bid = Bid;
            }
            // to ensure "Ask" is required (not null)
            if (Ask == null)
            {
                throw new InvalidDataException("Ask is a required property for SuccessTickerResponse and cannot be null");
            }
            else
            {
                this.Ask = Ask;
            }
            // to ensure "FiatVolume" is required (not null)
            if (FiatVolume == null)
            {
                throw new InvalidDataException("FiatVolume is a required property for SuccessTickerResponse and cannot be null");
            }
            else
            {
                this.FiatVolume = FiatVolume;
            }
            // to ensure "CoinVolume" is required (not null)
            if (CoinVolume == null)
            {
                throw new InvalidDataException("CoinVolume is a required property for SuccessTickerResponse and cannot be null");
            }
            else
            {
                this.CoinVolume = CoinVolume;
            }
            // to ensure "Open" is required (not null)
            if (Open == null)
            {
                throw new InvalidDataException("Open is a required property for SuccessTickerResponse and cannot be null");
            }
            else
            {
                this.Open = Open;
            }
            // to ensure "High" is required (not null)
            if (High == null)
            {
                throw new InvalidDataException("High is a required property for SuccessTickerResponse and cannot be null");
            }
            else
            {
                this.High = High;
            }
            // to ensure "Low" is required (not null)
            if (Low == null)
            {
                throw new InvalidDataException("Low is a required property for SuccessTickerResponse and cannot be null");
            }
            else
            {
                this.Low = Low;
            }
        }
        
        /// <summary>
        /// Gets or Sets LastPrice
        /// </summary>
        [DataMember(Name="lastPrice", EmitDefaultValue=false)]
        public long? LastPrice { get; set; }
        /// <summary>
        /// Gets or Sets Timestamp
        /// </summary>
        [DataMember(Name="timestamp", EmitDefaultValue=false)]
        public long? Timestamp { get; set; }
        /// <summary>
        /// Gets or Sets Bid
        /// </summary>
        [DataMember(Name="bid", EmitDefaultValue=false)]
        public long? Bid { get; set; }
        /// <summary>
        /// Gets or Sets Ask
        /// </summary>
        [DataMember(Name="ask", EmitDefaultValue=false)]
        public long? Ask { get; set; }
        /// <summary>
        /// Gets or Sets FiatVolume
        /// </summary>
        [DataMember(Name="fiatVolume", EmitDefaultValue=false)]
        public long? FiatVolume { get; set; }
        /// <summary>
        /// Gets or Sets CoinVolume
        /// </summary>
        [DataMember(Name="coinVolume", EmitDefaultValue=false)]
        public long? CoinVolume { get; set; }
        /// <summary>
        /// Gets or Sets Open
        /// </summary>
        [DataMember(Name="open", EmitDefaultValue=false)]
        public long? Open { get; set; }
        /// <summary>
        /// Gets or Sets High
        /// </summary>
        [DataMember(Name="high", EmitDefaultValue=false)]
        public long? High { get; set; }
        /// <summary>
        /// Gets or Sets Low
        /// </summary>
        [DataMember(Name="low", EmitDefaultValue=false)]
        public long? Low { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SuccessTickerResponse {\n");
            sb.Append("  LastPrice: ").Append(LastPrice).Append("\n");
            sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
            sb.Append("  Bid: ").Append(Bid).Append("\n");
            sb.Append("  Ask: ").Append(Ask).Append("\n");
            sb.Append("  FiatVolume: ").Append(FiatVolume).Append("\n");
            sb.Append("  CoinVolume: ").Append(CoinVolume).Append("\n");
            sb.Append("  Open: ").Append(Open).Append("\n");
            sb.Append("  High: ").Append(High).Append("\n");
            sb.Append("  Low: ").Append(Low).Append("\n");
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
            return this.Equals(obj as SuccessTickerResponse);
        }

        /// <summary>
        /// Returns true if SuccessTickerResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of SuccessTickerResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SuccessTickerResponse other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.LastPrice == other.LastPrice ||
                    this.LastPrice != null &&
                    this.LastPrice.Equals(other.LastPrice)
                ) && 
                (
                    this.Timestamp == other.Timestamp ||
                    this.Timestamp != null &&
                    this.Timestamp.Equals(other.Timestamp)
                ) && 
                (
                    this.Bid == other.Bid ||
                    this.Bid != null &&
                    this.Bid.Equals(other.Bid)
                ) && 
                (
                    this.Ask == other.Ask ||
                    this.Ask != null &&
                    this.Ask.Equals(other.Ask)
                ) && 
                (
                    this.FiatVolume == other.FiatVolume ||
                    this.FiatVolume != null &&
                    this.FiatVolume.Equals(other.FiatVolume)
                ) && 
                (
                    this.CoinVolume == other.CoinVolume ||
                    this.CoinVolume != null &&
                    this.CoinVolume.Equals(other.CoinVolume)
                ) && 
                (
                    this.Open == other.Open ||
                    this.Open != null &&
                    this.Open.Equals(other.Open)
                ) && 
                (
                    this.High == other.High ||
                    this.High != null &&
                    this.High.Equals(other.High)
                ) && 
                (
                    this.Low == other.Low ||
                    this.Low != null &&
                    this.Low.Equals(other.Low)
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
                if (this.LastPrice != null)
                    hash = hash * 59 + this.LastPrice.GetHashCode();
                if (this.Timestamp != null)
                    hash = hash * 59 + this.Timestamp.GetHashCode();
                if (this.Bid != null)
                    hash = hash * 59 + this.Bid.GetHashCode();
                if (this.Ask != null)
                    hash = hash * 59 + this.Ask.GetHashCode();
                if (this.FiatVolume != null)
                    hash = hash * 59 + this.FiatVolume.GetHashCode();
                if (this.CoinVolume != null)
                    hash = hash * 59 + this.CoinVolume.GetHashCode();
                if (this.Open != null)
                    hash = hash * 59 + this.Open.GetHashCode();
                if (this.High != null)
                    hash = hash * 59 + this.High.GetHashCode();
                if (this.Low != null)
                    hash = hash * 59 + this.Low.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
