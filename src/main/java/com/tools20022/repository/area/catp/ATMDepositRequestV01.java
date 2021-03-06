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

package com.tools20022.repository.area.catp;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ATMCardTransactionLatestVersion;
import com.tools20022.repository.msg.ATMDepositRequest1;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header31;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The ATMDepositRequest message is sent by an ATM to an acquirer or its agent
 * to request the approval of a deposit transaction at an ATM, before or after
 * deposit media inside the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01#mmHeader
 * ATMDepositRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01#mmProtectedATMDepositRequest
 * ATMDepositRequestV01.mmProtectedATMDepositRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01#mmATMDepositRequest
 * ATMDepositRequestV01.mmATMDepositRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositRequestV01#mmSecurityTrailer
 * ATMDepositRequestV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ATMDpstReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ATMCardTransactionLatestVersion
 * ATMCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catp.012.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMDepositRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMDepositRequest message is sent by an ATM to an acquirer or its agent to request the approval of a deposit transaction at an ATM, before or after deposit media inside the ATM."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDepositRequestV01", propOrder = {"header", "protectedATMDepositRequest", "aTMDepositRequest", "securityTrailer"})
public class ATMDepositRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header31 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header31
	 * Header31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the protocol management on a segment of the path from the ATM to the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDepositRequestV01, Header31> mmHeader = new MMMessageBuildingBlock<ATMDepositRequestV01, Header31>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header31.mmObject();
		}

		@Override
		public Header31 getValue(ATMDepositRequestV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ATMDepositRequestV01 obj, Header31 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "PrtctdATMDpstReq")
	protected ContentInformationType10 protectedATMDepositRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdATMDpstReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMDepositRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDepositRequestV01, Optional<ContentInformationType10>> mmProtectedATMDepositRequest = new MMMessageBuildingBlock<ATMDepositRequestV01, Optional<ContentInformationType10>>() {
		{
			xmlTag = "PrtctdATMDpstReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMDepositRequest";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMDepositRequestV01 obj) {
			return obj.getProtectedATMDepositRequest();
		}

		@Override
		public void setValue(ATMDepositRequestV01 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedATMDepositRequest(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMDpstReq")
	protected ATMDepositRequest1 aTMDepositRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositRequest1
	 * ATMDepositRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMDpstReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the request of a deposit transaction from an ATM."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDepositRequestV01, Optional<ATMDepositRequest1>> mmATMDepositRequest = new MMMessageBuildingBlock<ATMDepositRequestV01, Optional<ATMDepositRequest1>>() {
		{
			xmlTag = "ATMDpstReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositRequest";
			definition = "Information related to the request of a deposit transaction from an ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMDepositRequest1.mmObject();
		}

		@Override
		public Optional<ATMDepositRequest1> getValue(ATMDepositRequestV01 obj) {
			return obj.getATMDepositRequest();
		}

		@Override
		public void setValue(ATMDepositRequestV01 obj, Optional<ATMDepositRequest1> value) {
			obj.setATMDepositRequest(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType15 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDepositRequestV01, Optional<ContentInformationType15>> mmSecurityTrailer = new MMMessageBuildingBlock<ATMDepositRequestV01, Optional<ContentInformationType15>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}

		@Override
		public Optional<ContentInformationType15> getValue(ATMDepositRequestV01 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(ATMDepositRequestV01 obj, Optional<ContentInformationType15> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDepositRequestV01";
				definition = "The ATMDepositRequest message is sent by an ATM to an acquirer or its agent to request the approval of a deposit transaction at an ATM, before or after deposit media inside the ATM.";
				rootElement = "Document";
				xmlTag = "ATMDpstReq";
				businessArea_lazy = () -> ATMCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catp.ATMDepositRequestV01.mmHeader, com.tools20022.repository.area.catp.ATMDepositRequestV01.mmProtectedATMDepositRequest,
						com.tools20022.repository.area.catp.ATMDepositRequestV01.mmATMDepositRequest, com.tools20022.repository.area.catp.ATMDepositRequestV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catp";
						messageFunctionality = "012";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMDepositRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header31 getHeader() {
		return header;
	}

	public ATMDepositRequestV01 setHeader(Header31 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedATMDepositRequest() {
		return protectedATMDepositRequest == null ? Optional.empty() : Optional.of(protectedATMDepositRequest);
	}

	public ATMDepositRequestV01 setProtectedATMDepositRequest(ContentInformationType10 protectedATMDepositRequest) {
		this.protectedATMDepositRequest = protectedATMDepositRequest;
		return this;
	}

	public Optional<ATMDepositRequest1> getATMDepositRequest() {
		return aTMDepositRequest == null ? Optional.empty() : Optional.of(aTMDepositRequest);
	}

	public ATMDepositRequestV01 setATMDepositRequest(ATMDepositRequest1 aTMDepositRequest) {
		this.aTMDepositRequest = aTMDepositRequest;
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public ATMDepositRequestV01 setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.012.001.01")
	static public class Document {
		@XmlElement(name = "ATMDpstReq", required = true)
		public ATMDepositRequestV01 messageBody;
	}
}