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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.InformationType1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional information about a request (e.g. financing request).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation1#mmInformationType
 * AdditionalInformation1.mmInformationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalInformation1#mmInformationValue
 * AdditionalInformation1.mmInformationValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AdditionalInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional information about a request (e.g. financing request)."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalInformation1", propOrder = {"informationType", "informationValue"})
public class AdditionalInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InfTp", required = true)
	protected InformationType1Choice informationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InformationType1Choice
	 * InformationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation1
	 * AdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of additional information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalInformation1, InformationType1Choice> mmInformationType = new MMMessageAttribute<AdditionalInformation1, InformationType1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation1.mmObject();
			isDerived = false;
			xmlTag = "InfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationType";
			definition = "Specifies the type of additional information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InformationType1Choice.mmObject();
		}

		@Override
		public InformationType1Choice getValue(AdditionalInformation1 obj) {
			return obj.getInformationType();
		}

		@Override
		public void setValue(AdditionalInformation1 obj, InformationType1Choice value) {
			obj.setInformationType(value);
		}
	};
	@XmlElement(name = "InfVal", required = true)
	protected Max350Text informationValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalInformation1
	 * AdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contents of the additional information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalInformation1, Max350Text> mmInformationValue = new MMMessageAttribute<AdditionalInformation1, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalInformation1.mmObject();
			isDerived = false;
			xmlTag = "InfVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationValue";
			definition = "Contents of the additional information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(AdditionalInformation1 obj) {
			return obj.getInformationValue();
		}

		@Override
		public void setValue(AdditionalInformation1 obj, Max350Text value) {
			obj.setInformationValue(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalInformation1.mmInformationType, com.tools20022.repository.msg.AdditionalInformation1.mmInformationValue);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalInformation1";
				definition = "Additional information about a request (e.g. financing request).";
			}
		});
		return mmObject_lazy.get();
	}

	public InformationType1Choice getInformationType() {
		return informationType;
	}

	public AdditionalInformation1 setInformationType(InformationType1Choice informationType) {
		this.informationType = Objects.requireNonNull(informationType);
		return this;
	}

	public Max350Text getInformationValue() {
		return informationValue;
	}

	public AdditionalInformation1 setInformationValue(Max350Text informationValue) {
		this.informationValue = Objects.requireNonNull(informationValue);
		return this;
	}
}