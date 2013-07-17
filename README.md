utils
=====

Classe utilitárias do projeto LInE do Instituto de Matemática e Estatística da USP.

http
=====

Classe HttpUtil permite troca de informações com servidores através do protocolo HTTP. 

Permite fazer requisições GET (para buscar informações), POST (para submiter informações) e POST (com multi-part/formdata) (para fazer upload de arquivos).

Obs: esta classe funciona com Applet, a única restrição é que o servidor que será acessado via HTTP precisa estar no mesmo domínio. Caso contrário não será possível enviar/receber por questões de "cross-domain restrictions".

zip
=====

Classe ZipUtil permite criar arquivos compactos a partir de entradas de conteúdo em texto puro, InputStream e File.
