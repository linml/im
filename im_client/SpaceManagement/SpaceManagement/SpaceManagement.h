// SpaceManagement.h : PROJECT_NAME Ӧ�ó������ͷ�ļ�
//

#pragma once

#ifndef __AFXWIN_H__
	#error �ڰ������� PCH �Ĵ��ļ�֮ǰ������stdafx.h��
#endif

#include "resource.h"		// ������


// CSpaceManagementApp:
// �йش����ʵ�֣������ SpaceManagement.cpp
//

class CSpaceManagementApp : public CWinApp
{
public:
	CSpaceManagementApp();

// ��д
	public:
	virtual BOOL InitInstance();

// ʵ��

	DECLARE_MESSAGE_MAP()
};

extern CSpaceManagementApp theApp;