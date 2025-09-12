package mails

import (
	"bytes"
	"path/filepath"
	"text/template"
)

type SignUpOTPMail struct {
	Name string `json:"name"`
	Code string `json:"code"`
}

func BuildSignUpOTPMail(data *SignUpOTPMail) (string, error) {
	// Load template file
	tmplPath := filepath.Join("pkg/mails", "otp-verification.temp.html")
	tmpl, err := template.ParseFiles(tmplPath)
	if err != nil {
		return "", err
	}

	// Render template into a buffer
	var buf bytes.Buffer
	if err := tmpl.Execute(&buf, data); err != nil {
		return "", err
	}

	// Get final email body as string
	emailBody := buf.String()

	return emailBody, nil
}
