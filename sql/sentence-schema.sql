SET ROLE tq_admin;

CREATE SEQUENCE IF NOT EXISTS public.topic_id_seq
    AS bigint
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


CREATE TABLE IF NOT EXISTS public.sentence (
	id 		BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('public.topic_id_seq'::regclass),
	para_id	BIGINT NOT NULL Default -1,
	doc_id	BIGINT NOT NULL Default -1,
	data 	TEXT NOT NULL	-- json
);

CREATE INDEX IF NOT EXISTS sentence_idx ON public.sentence (id, para_id, doc_id);
