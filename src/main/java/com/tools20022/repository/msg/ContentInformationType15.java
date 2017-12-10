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
import com.tools20022.repository.area.caaa.*;
import com.tools20022.repository.area.caam.*;
import com.tools20022.repository.area.cain.*;
import com.tools20022.repository.area.catp.*;
import com.tools20022.repository.codeset.ContentType2Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General cryptographic message syntax (CMS) containing authenticated data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType15#mmContentType
 * ContentInformationType15.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType15#mmAuthenticatedData
 * ContentInformationType15.mmAuthenticatedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01#mmSecurityTrailer
 * HostToATMAcknowledgementV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01#mmSecurityTrailer
 * HostToATMRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementResponse#mmSecurityTrailer
 * NetworkManagementResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerFinancialResponse#mmSecurityTrailer
 * AcquirerFinancialResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalInitiation#mmSecurityTrailer
 * AcquirerReversalInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationInitiation#mmSecurityTrailer
 * AcquirerAuthorisationInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.ReconciliationInitiation#mmSecurityTrailer
 * ReconciliationInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerAuthorisationResponse#mmSecurityTrailer
 * AcquirerAuthorisationResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.NetworkManagementInitiation#mmSecurityTrailer
 * NetworkManagementInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalResponse#mmSecurityTrailer
 * AcquirerReversalResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.ReconciliationResponse#mmSecurityTrailer
 * ReconciliationResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerFinancialInitiation#mmSecurityTrailer
 * AcquirerFinancialInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV05#mmSecurityTrailer
 * AcceptorReconciliationResponseV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV05#mmSecurityTrailer
 * AcceptorDiagnosticResponseV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01#mmSecurityTrailer
 * ATMExceptionAcknowledgementV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV02#mmSecurityTrailer
 * ATMWithdrawalRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAdviceV01#mmSecurityTrailer
 * ATMExceptionAdviceV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV02#mmSecurityTrailer
 * ATMReconciliationAdviceV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02#mmSecurityTrailer
 * ATMReconciliationAcknowledgementV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositResponseV01#mmSecurityTrailer
 * ATMDepositResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01#mmSecurityTrailer
 * ATMDepositRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02#mmSecurityTrailer
 * ATMWithdrawalCompletionAdviceV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV02#mmSecurityTrailer
 * ATMInquiryResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#mmSecurityTrailer
 * ATMDepositCompletionAcknowledgementV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV02#mmSecurityTrailer
 * ATMPINManagementRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmSecurityTrailer
 * ATMTransferRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02#mmSecurityTrailer
 * ATMDiagnosticResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV02#mmSecurityTrailer
 * ATMDiagnosticRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV02#mmSecurityTrailer
 * ATMWithdrawalResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02#mmSecurityTrailer
 * ATMWithdrawalCompletionAcknowledgementV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV02#mmSecurityTrailer
 * ATMPINManagementResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#mmSecurityTrailer
 * ATMDepositCompletionAdviceV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV02#mmSecurityTrailer
 * ATMInquiryRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02#mmSecurityTrailer
 * ATMCompletionAcknowledgementV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV02#mmSecurityTrailer
 * ATMCompletionAdviceV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferResponseV01#mmSecurityTrailer
 * ATMTransferResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV06#mmSecurityTrailer
 * AcceptorAuthorisationResponseV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV06#mmSecurityTrailer
 * AcceptorAuthorisationRequestV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV06#mmSecurityTrailer
 * AcceptorCancellationRequestV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV06#mmSecurityTrailer
 * AcceptorCompletionAdviceResponseV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV06#mmSecurityTrailer
 * AcceptorCancellationAdviceV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV04#mmSecurityTrailer
 * AcceptorCurrencyConversionResponseV04.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV06#mmSecurityTrailer
 * AcceptorCompletionAdviceV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV04#mmSecurityTrailer
 * AcceptorCurrencyConversionRequestV04.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV06#mmSecurityTrailer
 * AcceptorCancellationAdviceResponseV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV06#mmSecurityTrailer
 * AcceptorCancellationResponseV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV06#mmSecurityTrailer
 * AcceptorReconciliationRequestV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV06#mmSecurityTrailer
 * AcceptorDiagnosticRequestV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01#mmSecurityTrailer
 * AcceptorCurrencyConversionAdviceResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceV01#mmSecurityTrailer
 * AcceptorCurrencyConversionAdviceV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
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
 * "ContentInformationType15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing authenticated data."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ContentInformationType15", propOrder = {"contentType", "authenticatedData"})
public class ContentInformationType15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ContentType2Code contentType;
	/**
	 * Type of data protection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code
	 * ContentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of data protection."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContentInformationType15.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType2Code.mmObject();
		}
	};
	protected AuthenticatedData4 authenticatedData;
	/**
	 * Data protection by a message authentication code (MAC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protection by a message authentication code (MAC)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthenticatedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType15.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthenticatedData4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ContentInformationType15.mmContentType, ContentInformationType15.mmAuthenticatedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(HostToATMAcknowledgementV01.mmSecurityTrailer, HostToATMRequestV01.mmSecurityTrailer, NetworkManagementResponse.mmSecurityTrailer, AcquirerFinancialResponse.mmSecurityTrailer,
						AcquirerReversalInitiation.mmSecurityTrailer, AcquirerAuthorisationInitiation.mmSecurityTrailer, ReconciliationInitiation.mmSecurityTrailer, AcquirerAuthorisationResponse.mmSecurityTrailer,
						NetworkManagementInitiation.mmSecurityTrailer, AcquirerReversalResponse.mmSecurityTrailer, ReconciliationResponse.mmSecurityTrailer, AcquirerFinancialInitiation.mmSecurityTrailer,
						AcceptorReconciliationResponseV05.mmSecurityTrailer, AcceptorDiagnosticResponseV05.mmSecurityTrailer, ATMExceptionAcknowledgementV01.mmSecurityTrailer, ATMWithdrawalRequestV02.mmSecurityTrailer,
						ATMExceptionAdviceV01.mmSecurityTrailer, ATMReconciliationAdviceV02.mmSecurityTrailer, ATMReconciliationAcknowledgementV02.mmSecurityTrailer, ATMDepositResponseV01.mmSecurityTrailer,
						ATMDepositRequestV01.mmSecurityTrailer, ATMWithdrawalCompletionAdviceV02.mmSecurityTrailer, ATMInquiryResponseV02.mmSecurityTrailer, ATMDepositCompletionAcknowledgementV01.mmSecurityTrailer,
						ATMPINManagementRequestV02.mmSecurityTrailer, ATMTransferRequestV01.mmSecurityTrailer, ATMDiagnosticResponseV02.mmSecurityTrailer, ATMDiagnosticRequestV02.mmSecurityTrailer,
						ATMWithdrawalResponseV02.mmSecurityTrailer, ATMWithdrawalCompletionAcknowledgementV02.mmSecurityTrailer, ATMPINManagementResponseV02.mmSecurityTrailer, ATMDepositCompletionAdviceV01.mmSecurityTrailer,
						ATMInquiryRequestV02.mmSecurityTrailer, ATMCompletionAcknowledgementV02.mmSecurityTrailer, ATMCompletionAdviceV02.mmSecurityTrailer, ATMTransferResponseV01.mmSecurityTrailer,
						AcceptorAuthorisationResponseV06.mmSecurityTrailer, AcceptorAuthorisationRequestV06.mmSecurityTrailer, AcceptorCancellationRequestV06.mmSecurityTrailer, AcceptorCompletionAdviceResponseV06.mmSecurityTrailer,
						AcceptorCancellationAdviceV06.mmSecurityTrailer, AcceptorCurrencyConversionResponseV04.mmSecurityTrailer, AcceptorCompletionAdviceV06.mmSecurityTrailer, AcceptorCurrencyConversionRequestV04.mmSecurityTrailer,
						AcceptorCancellationAdviceResponseV06.mmSecurityTrailer, AcceptorCancellationResponseV06.mmSecurityTrailer, AcceptorReconciliationRequestV06.mmSecurityTrailer, AcceptorDiagnosticRequestV06.mmSecurityTrailer,
						AcceptorCurrencyConversionAdviceResponseV01.mmSecurityTrailer, AcceptorCurrencyConversionAdviceV01.mmSecurityTrailer);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType15";
				definition = "General cryptographic message syntax (CMS) containing authenticated data.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CnttTp", required = true)
	public ContentType2Code getContentType() {
		return contentType;
	}

	public void setContentType(ContentType2Code contentType) {
		this.contentType = contentType;
	}

	@XmlElement(name = "AuthntcdData", required = true)
	public AuthenticatedData4 getAuthenticatedData() {
		return authenticatedData;
	}

	public void setAuthenticatedData(com.tools20022.repository.msg.AuthenticatedData4 authenticatedData) {
		this.authenticatedData = authenticatedData;
	}
}