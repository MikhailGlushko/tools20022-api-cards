/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AuthenticationMethod5Code;
import com.tools20022.repository.codeset.AuthenticationResultCode;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.entity.Authentication;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Data related to the authentication of the cardholder.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationMethod
 * CardholderAuthentication10.mmAuthenticationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationValue
 * CardholderAuthentication10.mmAuthenticationValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmProtectedAuthenticationValue
 * CardholderAuthentication10.mmProtectedAuthenticationValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmCardholderOnLinePIN
 * CardholderAuthentication10.mmCardholderOnLinePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmCardholderIdentification
 * CardholderAuthentication10.mmCardholderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAddressVerification
 * CardholderAuthentication10.mmAddressVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationType
 * CardholderAuthentication10.mmAuthenticationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationLevel
 * CardholderAuthentication10.mmAuthenticationLevel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationResult
 * CardholderAuthentication10.mmAuthenticationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10#mmAuthenticationAdditionalInformation
 * CardholderAuthentication10.mmAuthenticationAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Authentication
 * Authentication}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardholderAuthentication10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the authentication of the cardholder."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardholderAuthentication10", propOrder = {"authenticationMethod", "authenticationValue", "protectedAuthenticationValue", "cardholderOnLinePIN", "cardholderIdentification", "addressVerification", "authenticationType",
		"authenticationLevel", "authenticationResult", "authenticationAdditionalInformation"})
public class CardholderAuthentication10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AuthenticationMethod5Code authenticationMethod;
	/**
	 * Method and data intended to be used for this transaction to authenticate
	 * the cardholder or its card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethod5Code
	 * AuthenticationMethod5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationMethod
	 * Authentication.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method and data intended to be used for this transaction to authenticate the cardholder or its card."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationMethod;
			componentContext_lazy = () -> CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method and data intended to be used for this transaction to authenticate the cardholder or its card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethod5Code.mmObject();
		}
	};
	protected Max5000Binary authenticationValue;
	/**
	 * Value used to authenticate the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationValue
	 * Authentication.mmAuthenticationValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value used to authenticate the cardholder."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationValue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Authentication.mmAuthenticationValue;
			componentContext_lazy = () -> CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationValue";
			definition = "Value used to authenticate the cardholder.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	protected ContentInformationType10 protectedAuthenticationValue;
	/**
	 * Protection of the authentication value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdAuthntcnVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedAuthenticationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protection of the authentication value."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProtectedAuthenticationValue = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "PrtctdAuthntcnVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedAuthenticationValue";
			definition = "Protection of the authentication value.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ContentInformationType10.mmObject();
		}
	};
	protected OnLinePIN4 cardholderOnLinePIN;
	/**
	 * Encrypted personal identification number (PIN) and related information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OnLinePIN4 OnLinePIN4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrOnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderOnLinePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Encrypted personal identification number (PIN) and related information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardholderOnLinePIN = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Authentication.mmObject();
			componentContext_lazy = () -> CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrOnLinePIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderOnLinePIN";
			definition = "Encrypted personal identification number (PIN) and related information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OnLinePIN4.mmObject();
		}
	};
	protected PersonIdentification11 cardholderIdentification;
	/**
	 * Identification of the cardholder to verify.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PersonIdentification11
	 * PersonIdentification11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CrdhldrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardholderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the cardholder to verify."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCardholderIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "CrdhldrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardholderIdentification";
			definition = "Identification of the cardholder to verify.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PersonIdentification11.mmObject();
		}
	};
	protected AddressVerification1 addressVerification;
	/**
	 * Numeric characters of the cardholder's billing or shipping address for
	 * verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AddressVerification1
	 * AddressVerification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdrVrfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numeric characters of the cardholder's billing or shipping address for verification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAddressVerification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AdrVrfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressVerification";
			definition = "Numeric characters of the cardholder's billing or shipping address for verification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AddressVerification1.mmObject();
		}
	};
	protected Max35Text authenticationType;
	/**
	 * Type of authentication for a given method - e.g. three-domain
	 * authentication, scheme-proprietary authentication, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of authentication for a given method - e.g. three-domain authentication, scheme-proprietary authentication, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationType";
			definition = "Type of authentication for a given method - e.g. three-domain authentication, scheme-proprietary authentication, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text authenticationLevel;
	/**
	 * Level of authentication for a given type – e.g. value assigned by scheme
	 * rules or by bilateral agreements
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnLvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationLevel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Level of authentication for a given type – e.g. value assigned by scheme rules or by bilateral agreements"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationLevel = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnLvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationLevel";
			definition = "Level of authentication for a given type – e.g. value assigned by scheme rules or by bilateral agreements";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected AuthenticationResultCode authenticationResult;
	/**
	 * Result of authentication
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
	 * AuthenticationResultCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of authentication"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationResult = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationResult";
			definition = "Result of authentication";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AuthenticationResultCode.mmObject();
		}
	};
	protected Max35Text authenticationAdditionalInformation;
	/**
	 * Additional information related to the result of the authentication
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication10
	 * CardholderAuthentication10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcnAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the result of the authentication"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAuthenticationAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CardholderAuthentication10.mmObject();
			isDerived = false;
			xmlTag = "AuthntcnAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationAdditionalInformation";
			definition = "Additional information related to the result of the authentication";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardholderAuthentication10.mmAuthenticationMethod, CardholderAuthentication10.mmAuthenticationValue, CardholderAuthentication10.mmProtectedAuthenticationValue,
						CardholderAuthentication10.mmCardholderOnLinePIN, CardholderAuthentication10.mmCardholderIdentification, CardholderAuthentication10.mmAddressVerification, CardholderAuthentication10.mmAuthenticationType,
						CardholderAuthentication10.mmAuthenticationLevel, CardholderAuthentication10.mmAuthenticationResult, CardholderAuthentication10.mmAuthenticationAdditionalInformation);
				trace_lazy = () -> Authentication.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderAuthentication10";
				definition = "Data related to the authentication of the cardholder.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AuthntcnMtd", required = true)
	public AuthenticationMethod5Code getAuthenticationMethod() {
		return authenticationMethod;
	}

	public void setAuthenticationMethod(AuthenticationMethod5Code authenticationMethod) {
		this.authenticationMethod = authenticationMethod;
	}

	@XmlElement(name = "AuthntcnVal")
	public Max5000Binary getAuthenticationValue() {
		return authenticationValue;
	}

	public void setAuthenticationValue(Max5000Binary authenticationValue) {
		this.authenticationValue = authenticationValue;
	}

	@XmlElement(name = "PrtctdAuthntcnVal")
	public ContentInformationType10 getProtectedAuthenticationValue() {
		return protectedAuthenticationValue;
	}

	public void setProtectedAuthenticationValue(com.tools20022.repository.msg.ContentInformationType10 protectedAuthenticationValue) {
		this.protectedAuthenticationValue = protectedAuthenticationValue;
	}

	@XmlElement(name = "CrdhldrOnLinePIN")
	public OnLinePIN4 getCardholderOnLinePIN() {
		return cardholderOnLinePIN;
	}

	public void setCardholderOnLinePIN(com.tools20022.repository.msg.OnLinePIN4 cardholderOnLinePIN) {
		this.cardholderOnLinePIN = cardholderOnLinePIN;
	}

	@XmlElement(name = "CrdhldrId")
	public PersonIdentification11 getCardholderIdentification() {
		return cardholderIdentification;
	}

	public void setCardholderIdentification(com.tools20022.repository.msg.PersonIdentification11 cardholderIdentification) {
		this.cardholderIdentification = cardholderIdentification;
	}

	@XmlElement(name = "AdrVrfctn")
	public AddressVerification1 getAddressVerification() {
		return addressVerification;
	}

	public void setAddressVerification(com.tools20022.repository.msg.AddressVerification1 addressVerification) {
		this.addressVerification = addressVerification;
	}

	@XmlElement(name = "AuthntcnTp")
	public Max35Text getAuthenticationType() {
		return authenticationType;
	}

	public void setAuthenticationType(Max35Text authenticationType) {
		this.authenticationType = authenticationType;
	}

	@XmlElement(name = "AuthntcnLvl")
	public Max35Text getAuthenticationLevel() {
		return authenticationLevel;
	}

	public void setAuthenticationLevel(Max35Text authenticationLevel) {
		this.authenticationLevel = authenticationLevel;
	}

	@XmlElement(name = "AuthntcnRslt")
	public AuthenticationResultCode getAuthenticationResult() {
		return authenticationResult;
	}

	public void setAuthenticationResult(AuthenticationResultCode authenticationResult) {
		this.authenticationResult = authenticationResult;
	}

	@XmlElement(name = "AuthntcnAddtlInf")
	public Max35Text getAuthenticationAdditionalInformation() {
		return authenticationAdditionalInformation;
	}

	public void setAuthenticationAdditionalInformation(Max35Text authenticationAdditionalInformation) {
		this.authenticationAdditionalInformation = authenticationAdditionalInformation;
	}
}