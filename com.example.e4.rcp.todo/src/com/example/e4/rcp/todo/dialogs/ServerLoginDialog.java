package com.example.e4.rcp.todo.dialogs;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class ServerLoginDialog extends PasswordDialog {

	public static final String SERVER_URI_DEFAULT = "http://localhost:8080/todo";
	private Text txtServer;
	private String serverUri;

	public ServerLoginDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		Label lblUser = new Label(container, SWT.NONE);
		lblUser.setText("Server-Url:");
		
		txtServer = new Text(container, SWT.BORDER);
		txtServer.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false,
				1, 1));
		txtServer.setText(getServerUri());

		return container;
	}

	public String getServerUri() {
		return serverUri;
	}

	public void setServerUri(String serverUri) {
		this.serverUri = serverUri;
	}

}
