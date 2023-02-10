import smtplib
import email.message
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from email.mime.base import MIMEBase
from email import encoders

def send_email(messagemCorpo, Assunto, destinatario):
    corpo_email = messagemCorpo
    msg = email.message.Message()
    msg['Subject'] = Assunto
    msg['From'] = 'gbrielti000@gmail.com'
    msg['To'] = destinatario
    password = 'sjyrgqmzqtqyloty'
    msg.add_header('Content-Type', 'text/html')
    msg.set_payload(corpo_email)
    s = smtplib.SMTP('smtp.gmail.com: 587')
    s.starttls()
    s.login(msg['From'], password)
    s.sendmail(msg['From'], [msg['To']], msg.as_string().encode('utf-8'))
    print('Email enviado')

def send_email_anex(messagemCorpo, Assunto, destinatario, filename):
    remetente = 'gbrielti000@gmail.com'
    msg = MIMEMultipart()
    msg['From'] = remetente
    msg['To'] = destinatario
    msg['Subject'] = Assunto
    body = messagemCorpo
    msg.attach(MIMEText(body, 'plain'))
    attachment = open(filename, "rb")
    p = MIMEBase('application', 'octet-stream')
    p.set_payload((attachment).read())
    encoders.encode_base64(p)
    p.add_header('Content-Disposition', "attachment; filename= %s" % filename)
    msg.attach(p)
    s = smtplib.SMTP('smtp.gmail.com', 587)
    s.starttls()
    s.login(remetente, "sjyrgqmzqtqyloty")
    text = msg.as_string()
    s.sendmail(remetente, destinatario, text)
    s.quit()
    print('Email enviado')
