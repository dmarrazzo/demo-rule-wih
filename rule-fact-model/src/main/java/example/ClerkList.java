package example;

import java.util.ArrayList;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ClerkList implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.util.List<java.lang.String> clerk = new ArrayList<String>();

	public ClerkList() {
	}

	public java.util.List<java.lang.String> getClerk() {
		return this.clerk;
	}

	public void setClerk(java.util.List<java.lang.String> clerk) {
		this.clerk = clerk;
	}

	public ClerkList(java.util.List<java.lang.String> clerk) {
		this.clerk = clerk;
	}

	public void addClerk(String clerkUserId) {
		clerk.add(clerkUserId);
	}
}