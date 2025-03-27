package question.b;

interface Modem {
    void dial(String phoneNum);
    void hangup();
    void send(char c);
    char recv();
}
