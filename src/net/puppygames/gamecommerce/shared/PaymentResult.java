/*
 * Copyright (c) 2003-onwards Shaven Puppy Ltd
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'Shaven Puppy' nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.puppygames.gamecommerce.shared;

import java.io.Serializable;



/**
 * The results of a payment operation.
 */
public final class PaymentResult implements Serializable {

	public static final long serialVersionUID = 1L;

	private final String errorMessage;
	private final String id;
	private RegistrationDetails registrationDetails;

	/**
	 * Constructor
	 * @param id The transaction ID (payment processor specific)
	 * @param errorMessage The error message; null, if the payment was a success
	 */
	public PaymentResult(String id, String errorMessage) {
		this.id = id;
		this.errorMessage = errorMessage;
	}

	/**
	 * @return the error message, or null, if the payment was successful
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * @return the transaction id
	 */
	public String getID() {
		return id;
	}

	/**
	 * @return the registration details, if this was a successful result.
	 */
	public RegistrationDetails getRegistrationDetails() {
		return registrationDetails;
	}

	/**
	 * Set the registration details
	 * @param newRegistrationDetails
	 */
	public void setRegistrationDetails(RegistrationDetails newRegistrationDetails) {
		registrationDetails = newRegistrationDetails;
	}
}
