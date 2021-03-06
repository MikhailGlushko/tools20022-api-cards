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
import com.tools20022.repository.codeset.OutputFormat1Code;
import com.tools20022.repository.datatype.Max20000Text;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Message to be displayed to the cardholder or the cashier.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage5#mmFormat
 * ActionMessage5.mmFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActionMessage5#mmMessageContent
 * ActionMessage5.mmMessageContent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
 * CardPaymentAcquiring}</li>
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
 * "ActionMessage5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Message to be displayed to the cardholder or the cashier."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ActionMessage5", propOrder = {"format", "messageContent"})
public class ActionMessage5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Frmt")
	protected OutputFormat1Code format;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormat1Code
	 * OutputFormat1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage5 ActionMessage5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Format"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Format of the content."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActionMessage5, Optional<OutputFormat1Code>> mmFormat = new MMMessageAttribute<ActionMessage5, Optional<OutputFormat1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ActionMessage5.mmObject();
			isDerived = false;
			xmlTag = "Frmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Format";
			definition = "Format of the content.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OutputFormat1Code.mmObject();
		}

		@Override
		public Optional<OutputFormat1Code> getValue(ActionMessage5 obj) {
			return obj.getFormat();
		}

		@Override
		public void setValue(ActionMessage5 obj, Optional<OutputFormat1Code> value) {
			obj.setFormat(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgCntt", required = true)
	protected Max20000Text messageContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max20000Text Max20000Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmActionMessage
	 * CardPaymentAcquiring.mmActionMessage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage5 ActionMessage5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgCntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Text or graphic data to be display or printed to the cardholder or the cashier."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActionMessage5, Max20000Text> mmMessageContent = new MMMessageAttribute<ActionMessage5, Max20000Text>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmActionMessage;
			componentContext_lazy = () -> com.tools20022.repository.msg.ActionMessage5.mmObject();
			isDerived = false;
			xmlTag = "MsgCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageContent";
			definition = "Text or graphic data to be display or printed to the cardholder or the cashier.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max20000Text.mmObject();
		}

		@Override
		public Max20000Text getValue(ActionMessage5 obj) {
			return obj.getMessageContent();
		}

		@Override
		public void setValue(ActionMessage5 obj, Max20000Text value) {
			obj.setMessageContent(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ActionMessage5.mmFormat, com.tools20022.repository.msg.ActionMessage5.mmMessageContent);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActionMessage5";
				definition = "Message to be displayed to the cardholder or the cashier.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OutputFormat1Code> getFormat() {
		return format == null ? Optional.empty() : Optional.of(format);
	}

	public ActionMessage5 setFormat(OutputFormat1Code format) {
		this.format = format;
		return this;
	}

	public Max20000Text getMessageContent() {
		return messageContent;
	}

	public ActionMessage5 setMessageContent(Max20000Text messageContent) {
		this.messageContent = Objects.requireNonNull(messageContent);
		return this;
	}
}