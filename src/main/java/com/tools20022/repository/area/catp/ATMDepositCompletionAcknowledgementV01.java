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
import com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header32;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The ATMDepositCompletionAcknowledgement message is sent by an acquirer or its
 * agent to an ATM to acknowledge the receipt of an ATMDepositCompletionAdvice
 * message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#mmHeader
 * ATMDepositCompletionAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#mmProtectedATMDepositCompletionAcknowledgement
 * ATMDepositCompletionAcknowledgementV01.
 * mmProtectedATMDepositCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#mmATMDepositCompletionAcknowledgement
 * ATMDepositCompletionAcknowledgementV01.mmATMDepositCompletionAcknowledgement}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#mmSecurityTrailer
 * ATMDepositCompletionAcknowledgementV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ATMDpstCmpltnAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ATMCardTransactionLatestVersion
 * ATMCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catp.015.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMDepositCompletionAcknowledgementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMDepositCompletionAcknowledgement message is sent by an acquirer or its agent to an ATM to acknowledge the receipt of an ATMDepositCompletionAdvice message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDepositCompletionAcknowledgementV01", propOrder = {"header", "protectedATMDepositCompletionAcknowledgement", "aTMDepositCompletionAcknowledgement", "securityTrailer"})
public class ATMDepositCompletionAcknowledgementV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header32 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
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
	public static final MMMessageBuildingBlock<ATMDepositCompletionAcknowledgementV01, Header32> mmHeader = new MMMessageBuildingBlock<ATMDepositCompletionAcknowledgementV01, Header32>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header32.mmObject();
		}

		@Override
		public Header32 getValue(ATMDepositCompletionAcknowledgementV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ATMDepositCompletionAcknowledgementV01 obj, Header32 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "PrtctdATMDpstCmpltnAck")
	protected ContentInformationType10 protectedATMDepositCompletionAcknowledgement;
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
	 * xmlTag} = "PrtctdATMDpstCmpltnAck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMDepositCompletionAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDepositCompletionAcknowledgementV01, Optional<ContentInformationType10>> mmProtectedATMDepositCompletionAcknowledgement = new MMMessageBuildingBlock<ATMDepositCompletionAcknowledgementV01, Optional<ContentInformationType10>>() {
		{
			xmlTag = "PrtctdATMDpstCmpltnAck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMDepositCompletionAcknowledgement";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMDepositCompletionAcknowledgementV01 obj) {
			return obj.getProtectedATMDepositCompletionAcknowledgement();
		}

		@Override
		public void setValue(ATMDepositCompletionAcknowledgementV01 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedATMDepositCompletionAcknowledgement(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMDpstCmpltnAck")
	protected ATMDepositCompletionAcknowledgement1 aTMDepositCompletionAcknowledgement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAcknowledgement1
	 * ATMDepositCompletionAcknowledgement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMDpstCmpltnAck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositCompletionAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the acknowledgement of an ATM deposit transaction from the ATM manager."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDepositCompletionAcknowledgementV01, Optional<ATMDepositCompletionAcknowledgement1>> mmATMDepositCompletionAcknowledgement = new MMMessageBuildingBlock<ATMDepositCompletionAcknowledgementV01, Optional<ATMDepositCompletionAcknowledgement1>>() {
		{
			xmlTag = "ATMDpstCmpltnAck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositCompletionAcknowledgement";
			definition = "Information related to the acknowledgement of an ATM deposit transaction from the ATM manager.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMDepositCompletionAcknowledgement1.mmObject();
		}

		@Override
		public Optional<ATMDepositCompletionAcknowledgement1> getValue(ATMDepositCompletionAcknowledgementV01 obj) {
			return obj.getATMDepositCompletionAcknowledgement();
		}

		@Override
		public void setValue(ATMDepositCompletionAcknowledgementV01 obj, Optional<ATMDepositCompletionAcknowledgement1> value) {
			obj.setATMDepositCompletionAcknowledgement(value.orElse(null));
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
	public static final MMMessageBuildingBlock<ATMDepositCompletionAcknowledgementV01, Optional<ContentInformationType15>> mmSecurityTrailer = new MMMessageBuildingBlock<ATMDepositCompletionAcknowledgementV01, Optional<ContentInformationType15>>() {
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
		public Optional<ContentInformationType15> getValue(ATMDepositCompletionAcknowledgementV01 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(ATMDepositCompletionAcknowledgementV01 obj, Optional<ContentInformationType15> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDepositCompletionAcknowledgementV01";
				definition = "The ATMDepositCompletionAcknowledgement message is sent by an acquirer or its agent to an ATM to acknowledge the receipt of an ATMDepositCompletionAdvice message.";
				rootElement = "Document";
				xmlTag = "ATMDpstCmpltnAck";
				businessArea_lazy = () -> ATMCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01.mmHeader,
						com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01.mmProtectedATMDepositCompletionAcknowledgement,
						com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01.mmATMDepositCompletionAcknowledgement, com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catp";
						messageFunctionality = "015";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMDepositCompletionAcknowledgementV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header32 getHeader() {
		return header;
	}

	public ATMDepositCompletionAcknowledgementV01 setHeader(Header32 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedATMDepositCompletionAcknowledgement() {
		return protectedATMDepositCompletionAcknowledgement == null ? Optional.empty() : Optional.of(protectedATMDepositCompletionAcknowledgement);
	}

	public ATMDepositCompletionAcknowledgementV01 setProtectedATMDepositCompletionAcknowledgement(ContentInformationType10 protectedATMDepositCompletionAcknowledgement) {
		this.protectedATMDepositCompletionAcknowledgement = protectedATMDepositCompletionAcknowledgement;
		return this;
	}

	public Optional<ATMDepositCompletionAcknowledgement1> getATMDepositCompletionAcknowledgement() {
		return aTMDepositCompletionAcknowledgement == null ? Optional.empty() : Optional.of(aTMDepositCompletionAcknowledgement);
	}

	public ATMDepositCompletionAcknowledgementV01 setATMDepositCompletionAcknowledgement(ATMDepositCompletionAcknowledgement1 aTMDepositCompletionAcknowledgement) {
		this.aTMDepositCompletionAcknowledgement = aTMDepositCompletionAcknowledgement;
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public ATMDepositCompletionAcknowledgementV01 setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.015.001.01")
	static public class Document {
		@XmlElement(name = "ATMDpstCmpltnAck", required = true)
		public ATMDepositCompletionAcknowledgementV01 messageBody;
	}
}