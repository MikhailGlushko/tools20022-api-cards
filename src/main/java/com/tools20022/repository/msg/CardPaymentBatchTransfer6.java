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
import com.tools20022.repository.area.caaa.AcceptorBatchTransferV07;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardPaymentDataSet19;
import com.tools20022.repository.msg.TransactionTotals7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Card payment transactions from one or several data set of transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer6#mmTransactionTotals
 * CardPaymentBatchTransfer6.mmTransactionTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer6#mmDataSet
 * CardPaymentBatchTransfer6.mmDataSet}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV07#mmBatchTransfer
 * AcceptorBatchTransferV07.mmBatchTransfer}</li>
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
 * "CardPaymentBatchTransfer6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Card payment transactions from one or several data set of transactions."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentBatchTransfer6", propOrder = {"transactionTotals", "dataSet"})
public class CardPaymentBatchTransfer6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxTtls")
	protected List<TransactionTotals7> transactionTotals;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionTotals7
	 * TransactionTotals7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer6
	 * CardPaymentBatchTransfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Totals of transactions of all the data sets."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentBatchTransfer6, List<TransactionTotals7>> mmTransactionTotals = new MMMessageAttribute<CardPaymentBatchTransfer6, List<TransactionTotals7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentBatchTransfer6.mmObject();
			isDerived = false;
			xmlTag = "TxTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTotals";
			definition = "Totals of transactions of all the data sets.";
			minOccurs = 0;
			complexType_lazy = () -> TransactionTotals7.mmObject();
		}

		@Override
		public List<TransactionTotals7> getValue(CardPaymentBatchTransfer6 obj) {
			return obj.getTransactionTotals();
		}

		@Override
		public void setValue(CardPaymentBatchTransfer6 obj, List<TransactionTotals7> value) {
			obj.setTransactionTotals(value);
		}
	};
	@XmlElement(name = "DataSet")
	protected List<CardPaymentDataSet19> dataSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet19
	 * CardPaymentDataSet19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransfer6
	 * CardPaymentBatchTransfer6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card payment transactions from one data set of transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CardPaymentBatchTransfer6, List<CardPaymentDataSet19>> mmDataSet = new MMMessageAttribute<CardPaymentBatchTransfer6, List<CardPaymentDataSet19>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentBatchTransfer6.mmObject();
			isDerived = false;
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Card payment transactions from one data set of transactions.";
			minOccurs = 0;
			complexType_lazy = () -> CardPaymentDataSet19.mmObject();
		}

		@Override
		public List<CardPaymentDataSet19> getValue(CardPaymentBatchTransfer6 obj) {
			return obj.getDataSet();
		}

		@Override
		public void setValue(CardPaymentBatchTransfer6 obj, List<CardPaymentDataSet19> value) {
			obj.setDataSet(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentBatchTransfer6.mmTransactionTotals, com.tools20022.repository.msg.CardPaymentBatchTransfer6.mmDataSet);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorBatchTransferV07.mmBatchTransfer);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentBatchTransfer6";
				definition = "Card payment transactions from one or several data set of transactions.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<TransactionTotals7> getTransactionTotals() {
		return transactionTotals == null ? transactionTotals = new ArrayList<>() : transactionTotals;
	}

	public CardPaymentBatchTransfer6 setTransactionTotals(List<TransactionTotals7> transactionTotals) {
		this.transactionTotals = Objects.requireNonNull(transactionTotals);
		return this;
	}

	public List<CardPaymentDataSet19> getDataSet() {
		return dataSet == null ? dataSet = new ArrayList<>() : dataSet;
	}

	public CardPaymentBatchTransfer6 setDataSet(List<CardPaymentDataSet19> dataSet) {
		this.dataSet = Objects.requireNonNull(dataSet);
		return this;
	}
}