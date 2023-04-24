SET ROLE tq_admin;

CREATE SEQUENCE IF NOT EXISTS public.document_id_seq
    AS bigint
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


CREATE TABLE IF NOT EXISTS public.document (
	id 			BIGINT PRIMARY KEY NOT NULL DEFAULT nextval('public.document_id_seq'::regclass),
	data 		TEXT NOT NULL, -- json
	typ			TEXT NOT NULL  -- one of 'conv' or 'doc
);

CREATE INDEX IF NOT EXISTS document_idx ON public.document (id, typ);
