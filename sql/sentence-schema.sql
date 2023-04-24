SET ROLE tq_admin;

CREATE SEQUENCE IF NOT EXISTS public.sentence_id_seq
    AS bigint
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


CREATE TABLE IF NOT EXISTS public.sentence (
	id 		BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('public.sentence_id_seq'::regclass),
	para_id	BIGINT NOT NULL Default -1 REFERENCES  public.paragraph (id),
	doc_id	BIGINT NOT NULL Default -1 REFERENCES  public.document (id),
	data 	TEXT NOT NULL	-- json
);

CREATE INDEX IF NOT EXISTS sentence_idx ON public.sentence (id, para_id, doc_id);
